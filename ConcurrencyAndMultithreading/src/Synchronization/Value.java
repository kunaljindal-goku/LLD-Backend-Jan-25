package Synchronization;

public class Value {

    int x;

    public Value(int x) {
        this.x = x;
    }

    public synchronized void increment(int i) {
        this.x += i;
    }

    public synchronized void decrment(int i) {
        this.x -= i;
    }
}
