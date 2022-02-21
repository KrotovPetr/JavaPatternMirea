package task4;

public interface myExecutor {
    void shutdown();
    void submit(Runnable thread);
}
