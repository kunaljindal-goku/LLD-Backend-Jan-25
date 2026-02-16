package Semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {

        Store store = new Store(5);

        ExecutorService ex = Executors.newCachedThreadPool();

        Semaphore producderSemaphor = new Semaphore(5);
        Semaphore consumerSemaphor = new Semaphore(0);


        for(int i=1;i<=8;i++) {
            Producer p = new Producer(store,producderSemaphor,consumerSemaphor);
            ex.execute(p);
        }

        for(int i=1;i<=20;i++) {
            Consumer c = new Consumer(store,producderSemaphor,consumerSemaphor);
            ex.execute(c);
        }

        ex.shutdown();



    }
}
