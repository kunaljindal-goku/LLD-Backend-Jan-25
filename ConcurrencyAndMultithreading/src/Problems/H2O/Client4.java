package Problems.H2O;

import java.util.concurrent.*;

public class Client4 {

    public static void main(String[] args) throws Exception {

        H2O h2o = new H2O();

        int hydrogenCount = 6;
        int oxygenCount = 3;

        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable releaseHydrogen = () -> System.out.print("H");
        Runnable releaseOxygen = () -> System.out.print("O ");

        // submit hydrogen threads
        for (int i = 0; i < hydrogenCount; i++) {
            executor.execute(() -> {
                try {
                    h2o.hydrogen(releaseHydrogen);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // submit oxygen threads
        for (int i = 0; i < oxygenCount; i++) {
            executor.execute(() -> {
                try {
                    h2o.oxygen(releaseOxygen);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("\nDone");
    }
}
