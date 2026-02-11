public class NumberPrinter implements Runnable{
    int x;
    public NumberPrinter(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        print(this.x);
    }

    public void print(int x) {
        System.out.println("Number = "+x + " Thread = "+Thread.currentThread().getName());
    }
}
