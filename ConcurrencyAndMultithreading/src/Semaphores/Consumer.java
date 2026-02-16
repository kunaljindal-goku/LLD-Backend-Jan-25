package Semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    private Semaphore producerSemaphor;
    private Semaphore consumerSemaphor;

    public Consumer(Store store,
                    Semaphore producerSemaphor,
                    Semaphore consumerSemaphor) {
        this.producerSemaphor = producerSemaphor;
        this.consumerSemaphor = consumerSemaphor;
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSemaphor.acquire(); // consumer--
                store.removeItem();
                producerSemaphor.release(); // producer ++
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
