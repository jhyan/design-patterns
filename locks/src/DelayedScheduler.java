import javafx.concurrent.Task;

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