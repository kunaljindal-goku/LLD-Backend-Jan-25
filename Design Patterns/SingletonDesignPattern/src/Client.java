import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
//        Dbc db1 = Dbc.getInstance();
//        Dbc db2 = Dbc.getInstance();
//
//        System.out.println("Db1: "+db1);
//        System.out.println("Db2: "+db2);

        ExecutorService executor = Executors.newFixedThreadPool(4);

//        Runnable eagerLoadingTask = () -> {
//            Dbc dbc = Dbc.getInstance();
//            System.out.println(
//                    Thread.currentThread().getName() +
//                            " got instance with address: " +
//                            dbc
//            );
//        };
//
        Runnable multithreadedTask = () -> {
            MultithreadedDbc dbc = MultithreadedDbc.createInstance();
            System.out.println(
                    Thread.currentThread().getName() +
                            " got instance with address: " +
                            dbc
            );
        };

        for (int i = 0; i < 1000; i++) {
            executor.submit(multithreadedTask);
        }
//
        executor.shutdown();
    }
}
