package JavaCollection.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, null);
        map.put(2, null);
        map.put(3, null);
        map.put(4, null);
        map.put(5, null);

        Set<Integer> keys = map.keySet();
        Integer[] arr = keys.toArray(new Integer[0]);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

