package Fail_Fast_Fail_Safe_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Mian {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("orange");


        Iterator<String> iterator = list.iterator();

//        list.remove("orange");

        while(iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            iterator.remove();
        }

        System.out.println(list);

    }
}
