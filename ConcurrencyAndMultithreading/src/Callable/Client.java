package Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        NumMultiplier numMultiplier = new NumMultiplier(2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // runnable -> executorService.execut()
        // callable -> submit()

        Future<Integer> future = executorService.submit(numMultiplier);
        System.out.println("A");

        int x = future.get(); // wait
        System.out.println(x);

    }
}
