package task4;
import java.util.concurrent.*;

public class testClass implements myExecutor  {
    ExecutorService executorService;
    public testClass(int threadsAmount){
        executorService = Executors.newFixedThreadPool(threadsAmount);
    }


    @Override
    public void shutdown() {
        executorService.shutdown();
    }


    @Override
    public void submit(Runnable thread) {
        executorService.submit(thread);
    }
}
