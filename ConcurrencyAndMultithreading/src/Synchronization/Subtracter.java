package Synchronization;

import java.util.concurrent.Callable;

public class Subtracter implements Callable<Void> {

    Value value;

    public Subtracter(Value value) {
        this.value = value;
    }


    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100;i++) {
            this.value.x -= i;
        }
        return null;
    }
}
