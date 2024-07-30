package JavaCollection.Map;

import JavaCollection.PriorityQueue.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomObjectKeyDemo {

    public static void main(String[] args) {

        Map<Employee, Integer> hm = new HashMap<>();
//              this uses hashcode and equals method to maintain that duplicate key doesn't insert

//        Map<Employee, Integer> hm = new TreeMap<>(new AgeComparator()); //sort on the basis on age

//        Map<Employee, Integer> hm = new LinkedHashMap<>();//follow insertion order

        Employee e1 = new Employee(12,"abc");
        Employee e2 = new Employee(12,"abdc");
//        Employee e3 = new Employee(12,"ddddd");
        Employee e4 = new Employee(123,"abddsdsc");
        Employee e5 = new Employee(84,"abssssssc");

        hm.put(e1,100);
        hm.put(e4,200);
        hm.put(e5,210);
        hm.put(e2,234);

        System.out.println(hm);

    }
}
