package Synchronization;

import MergeSort.Sorter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value(0);

        Adder adder = new Adder(value);
        Subtracter subtracter = new Subtracter(value);

        ExecutorService ex = Executors.newFixedThreadPool(2);

        Future<Void> adderFuture = ex.submit(adder);
        Future<Void> subFuture = ex.submit(subtracter);

        adderFuture.get();
        subFuture.get();

        System.out.println(value.x);

        ex.shutdown();
    }
}
