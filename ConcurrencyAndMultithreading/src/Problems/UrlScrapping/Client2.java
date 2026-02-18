package Problems.UrlScrapping;

import java.util.*;
import java.util.concurrent.*;

public class Client2 {

    public static void main(String[] args) throws Exception {

        // Create dummy URLs
        List<String> urls = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            urls.add("http://example.com/page" + i);
        }

        // FixedThreadPool(10)
        ExecutorService fixedPool = Executors.newFixedThreadPool(10);

        long fixedTime = executeTasks(urls, fixedPool);
        System.out.println("FixedThreadPool Time: " + fixedTime + " ms");

        // CachedThreadPool
        ExecutorService cachedPool = Executors.newCachedThreadPool();

        long cachedTime = executeTasks(urls, cachedPool);
        System.out.println("CachedThreadPool Time: " + cachedTime + " ms");
    }

    private static long executeTasks(List<String> urls,
                                     ExecutorService executor) throws Exception {

        List<Future<Void>> futures = new ArrayList<>();

        long start = System.currentTimeMillis();

        // Submit tasks
        for (String url : urls) {
            futures.add(executor.submit(new ScrapURL(url)));
        }

        // Wait for all tasks
        for (Future<Void> future : futures) {
            future.get();
        }

        long end = System.currentTimeMillis();

        executor.shutdown();

        return end - start;
    }
}
