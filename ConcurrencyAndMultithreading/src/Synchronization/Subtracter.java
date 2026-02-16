package Synchronization;

import java.awt.event.KeyListener;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtracter implements Callable<Void> {

    Value value;
    private Lock lock;

    public Subtracter(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }


//    @Override
//    public Void call() throws Exception {
//        for (int i = 1; i <= 100; i++) {
//            // lock.lock();
//            synchronized (value) {
//                this.value.x -= i;
//                System.out.println("Subtarctor is subtracting: " + i);
//            }
//            // lock.unlock();
//        }
//        return null;
//    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
                value.decrment(i);
                System.out.println("Subtarctor is subtracting: " + i);
        }
        return null;
    }
}
