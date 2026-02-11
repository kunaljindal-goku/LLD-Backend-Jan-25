import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
//        System.out.println("Hello World " + Thread.currentThread().getName());
//
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        Thread t = new Thread(helloWorldPrinter);
//        t.run();


        //Print  1-100 using separate threads
//        for(int i=1;i<=100;i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread t = new Thread(numberPrinter);
//            t.start();
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=1;i<=100;i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

    }
}
