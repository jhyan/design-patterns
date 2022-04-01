public interface Runnable {
  public void run() {};
}


public interface Scheduler {
  public void scheduleToRun(long delayInMs, Runnable task);
}

public class DelayedScheduler implements Scheduler {
  DelayQueue<Task> q;

  public DelayedScheduler() {
  }

  void addConsumer() {
    Runnable consumerThread = TaskConsumer(q);
    consumerThread.run();
  }

  void scheduleToRun(long delayInMs, Runnable task) {
    Task task = new Task(delayInMs, task);
    Runnable producerThread = TaskProducer(q, task);
    producerThread.run();
  }
}


public class TaskConsumer implements Runnable {
  DelayQueue<Task> dq;
  public void run() {
    while (true) {
      q.get().run();
    }
  }
}

public class TaskProducer implements Runnable {
  DelayQueue<Task> dq;
  Task task;


  public void run() {
    q.put(task);
  }
}

public class DelayQueue<Task> {

  private final PriorityQueue<Task> pq = new PriorityQueue<>();
  private final Lock lock = new ReentrantLock();
  private final Condition available = lock.newCondition();
  private Thread activeForTop = null;

  public void put(Task task) {
    lock.lock();
    try {
      pq.offer(task);

      // newly added task is earlier than all existing tasks.
      if (pq.peek().equals(task)) {
        available.signal();
      }
    } finally {
      lock.unlock();
    }
  }

  public Task get() {
    lock.lock();
    try {
      while (true) {
        if (pq.size() == 0) {
          available.await();
        }
        Task top = pq.peek();
        long delay = top.getCurrentDelay();
        if (delay <= 0) {
          return top;
        } else {
          if (topIsClaimed()) {
            available.await();
          } else {
            claimTop();
            available.await(delay);
            unclaimTop();
          }
        }
      }
    } finally {
      if (pq.size() > 0) {
        available.signal();
      }
      lock.unlock();
    }
  }

  private boolean topIsClaimed() {
    return activeForTop != null;
  }

  private boolean topIsClaimedByCurrentThread() {
    return activeForTop == Thread.currentThread;
  }

  private void claimTop() {
    activeForTop = Thread.currentThread();
  }
  private void unclaimTop() {
    if (topIsClaimedByCurrentThread()) {
      activeForTop = null;
    }
  }

}

// Initailze empty Scheduler with 2 consumers
// schedule (1h, "task 1") consumer 1
// schedule (4h, "task 2")
// schedule (4h, "task 3")
// schedule (1h, "task 4")
// Time 1h