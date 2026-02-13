package MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(4,3,1,5,8,2);

        ExecutorService executorService = Executors.newFixedThreadPool(arr.size());

        Sorter sorter = new Sorter(arr,executorService);
        Future<List<Integer>> future = executorService.submit(sorter);

        System.out.println(future.get());

        executorService.shutdown();
    }
}
