package Semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSemaphor;
    private Semaphore consumerSemaphor;

    public Producer(Store store,
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
                producerSemaphor.acquire(); // prodcuer --
                store.addItem(new Object());
                consumerSemaphor.release(); // consumer++
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
