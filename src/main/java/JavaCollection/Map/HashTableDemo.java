package JavaCollection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer,Integer> ht = new Hashtable<>();

        HashMap<String, Integer> cart = new HashMap<>();
        // Adding elements in the cart map
        cart.put("Butter", 5);
        cart.put("Milk", 10);
        cart.put("Rice", 20);
        cart.put("Bread", 2);
        cart.put("Peanut", 2);
        // printing synchronized map from HashMap
       Map mapSynched = Collections.synchronizedMap(cart);
        System.out.println("Synchronized Map from HashMap: " + mapSynched);
    }
}
