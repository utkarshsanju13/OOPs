package JavaCollection.PriorityQueue;

import Assignment.P;

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {
//        Object AgeComparator;
        PriorityQueue<Employee> pq = new PriorityQueue<>(new AgeComparator());
        pq.offer(new Employee(12,"abc"));
        pq.add(new Employee(21,"addd"));
        pq.add(new Employee(3,"ddddd"));
        pq.add(new Employee(123,"abddsdsc"));
        pq.add(new Employee(84,"abssssssc"));

//        System.out.println(pq.peek().toString());

//        TreeSet<Employee> treeSet = new TreeSet<>(new AgeComparator());
//        treeSet.add(new Employee(12,"abc"));
//        treeSet.add(new Employee(12,"addbc"));
//        treeSet.add(new Employee(12,"ddddd"));
//        treeSet.add(new Employee(123,"abddsdsc"));
//        treeSet.add(new Employee(84,"abssssssc"));

//        System.out.println(treeSet);

        Set<Employee> set = new HashSet<>();
        set.add(new Employee(12,"abc"));
        set.add(new Employee(12,"addbc"));
        set.add(new Employee(12,"ddddd"));
        set.add(new Employee(123,"abddsdsc"));
        set.add(new Employee(84,"abssssssc"));

        System.out.println(set);


        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("hello",12);

        //Traverse key value pair
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Traverse only the keys
        for(String key : hm.keySet()){
            System.out.println(key);
        }

        //traverse only the value
        for(Integer i: hm.values()) {
            System.out.println(i);
        }
    }
}
