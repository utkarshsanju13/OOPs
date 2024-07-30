package JavaCollection.Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapAsLRU {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map
                = new LinkedHashMap<>(16, .75f, true);
        map.put(1, null);
        map.put(2, null);
        map.put(3, null);
        map.put(4, null);
        map.put(5, null);

        Set<Integer> keys = map.keySet();
        System.out.println(keys.toString());//[1, 2, 3, 4, 5]: 5 is most recent used

        map.get(4);
        System.out.println(keys.toString());//[1, 2, 3, 5, 4]: 4 is most recent used

        map.get(1);
        System.out.println(keys.toString()); //[2, 3, 5, 4, 1]: 1 is most recent used

        map.get(3);
        System.out.println(keys.toString());//[2, 5, 4, 1, 3]: 3 is most recent used



        Map m = Collections.synchronizedMap(new LinkedHashMap<Integer,Integer>());


    }
}

