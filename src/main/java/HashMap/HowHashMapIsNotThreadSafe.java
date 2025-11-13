package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HowHashMapIsNotThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> map = new HashMap<>();

        // Runnable task to insert values in the map
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, Thread.currentThread().getName());
            }
        };

        // Two threads writing to the same HashMap
        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Expected size is 1000, but due to race conditions it may be less
        System.out.println("Final map size: " + map.size());
        System.out.println(map);
    }

}
