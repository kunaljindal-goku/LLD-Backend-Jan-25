package Synchronization;

import MergeSort.Sorter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value(0);

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(value, lock);
        Subtracter subtracter = new Subtracter(value, lock);

        ExecutorService ex = Executors.newFixedThreadPool(2);

        Future<Void> adderFuture = ex.submit(adder);
        Future<Void> subFuture = ex.submit(subtracter);

        adderFuture.get();
        subFuture.get();

        System.out.println(value.x);

        ex.shutdown();
    }
}
