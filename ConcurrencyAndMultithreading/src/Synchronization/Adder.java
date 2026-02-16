package Synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    Value value;
    private Lock lock;

    public Adder(Value value,
                 Lock lock) {
        this.value = value;
        this.lock = lock;
    }


//    @Override
//    public Void call() throws Exception {
//        for (int i = 1; i <= 100; i++) {
//            //  lock.lock();
//            synchronized (value) {
//                this.value.x += i;
//                System.out.println("Adder is adding: " + i);
//            }
//        }
//        return null;
//    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
                value.increment(i);
                System.out.println("Adder is adding: " + i);
        }
        return null;
    }
}
