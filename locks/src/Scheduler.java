public interface Scheduler {
    public void scheduleToRun(long delayInMs, Runnable task);
}