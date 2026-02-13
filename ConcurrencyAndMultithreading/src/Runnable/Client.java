package Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
//        System.out.println("Hello World " + Thread.currentThread().getName());
//
//        Runnable.HelloWorldPrinter helloWorldPrinter = new Runnable.HelloWorldPrinter();
//        Thread t = new Thread(helloWorldPrinter);
//        t.run();


        //Print  1-100 using separate threads
//        for(int i=1;i<=1000000;i++) {
//            Runnable.NumberPrinter numberPrinter = new Runnable.NumberPrinter(i);
//            Thread t = new Thread(numberPrinter);
//            t.start();
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);

      //  ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=1;i<=1000000;i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

        executorService.shutdown();

    }
}
