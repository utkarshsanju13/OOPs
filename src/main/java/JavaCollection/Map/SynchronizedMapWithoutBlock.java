package JavaCollection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizedMapWithoutBlock {
    public static void main(String[] args) {
        // Create a HashMap and synchronize it
        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());

        // Populate the map with some entries
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // Start a thread that modifies the map
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                map.put("key" + (i + 4), "value" + (i + 4));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Iterate over the map without a synchronized block
        try {
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                System.out.println(entry.getKey() + ": " + entry.getValue());
                Thread.sleep(100);  // Slow down the iteration to increase the chance of modification
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

