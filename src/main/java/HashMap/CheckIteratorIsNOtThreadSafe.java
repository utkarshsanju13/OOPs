package HashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CheckIteratorIsNOtThreadSafe {

    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
//        Hashtable<>
//        ConcurrentHashMap<>

        // Runnable task to insert values in the map
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, Thread.currentThread().getName());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // Two threads writing to the same HashMap
        Thread t1 = new Thread(task, "T1");

        t1.start();

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = entrySet.iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey() + " "+entry.getValue());
            Thread.sleep(100);
        }

    }
}
