package org.example;

import java.lang.reflect.Array;
import java.util.*;

class RandomizedSet {
    HashMap<Integer,Integer> hm; //<Val,IndexInList>
    List<Integer> list;
    Random rn;

    public RandomizedSet() {
        hm = new HashMap<>();
        list = new ArrayList<>();
        rn = new Random();
    }

    public boolean insert(int val) {
        if(!hm.containsKey(val)){
            int size = list.size();   //calculating list first free index that must be the size of list Eg: 0 element is list return size = 0
//            and we can insert at index 0 in list
            hm.put(val,size);
            list.add(val);
            return true;
        }

        return false;
    }

    public boolean remove(int val) {
        if(hm.containsKey(val)){
            int idx = hm.get(val);  // this idx element to remove.BUt what we do we replace the element last element in list to this idx and then remove the last index
                                     //  beacuse the time complexity to remove last element is O(1) but at some middle index its O(n) due to shifting the right to element

            int lastElement = list.get(list.size()-1);
            list.set(idx,lastElement);
            list.remove(list.size()-1);

            hm.put(lastElement,idx);
            hm.remove(val);

            return true;
        }

        return false;

    }

    public int getRandom() {

        int size = list.size();

        int randomNum = rn.nextInt(size);

        return list.get(randomNum);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
