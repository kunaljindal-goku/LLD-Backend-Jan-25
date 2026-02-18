package Problems.BankAccount;

import java.util.concurrent.*;

public class Client3 {

    public static void main(String[] args) throws Exception {

        BankAccount bankAccount = new BankAccount();

        // lambda function
        Runnable depositTask = () -> {
            bankAccount.deposit(1000L);
        };

        Runnable withdrawTask = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bankAccount.withdraw(1000L);
        };

        ExecutorService executor = Executors.newFixedThreadPool(10);

      //  long start = System.currentTimeMillis();

        // Multiple depositors + withdrawers
        for (int i = 0; i < 5; i++) {
            executor.execute(depositTask);
            executor.execute(withdrawTask);
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Final Balance: " + bankAccount.getBalance());


        System.out.println("Final Balance: " + bankAccount.getBalance());

       // long end = System.currentTimeMillis();


    }
}
