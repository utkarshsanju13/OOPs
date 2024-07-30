package JavaCollection.Map;

import JavaCollection.PriorityQueue.Employee;

import java.util.Comparator;

public class AgeComparator implements Comparator<JavaCollection.PriorityQueue.Employee> {

    @Override
    public int compare(JavaCollection.PriorityQueue.Employee o1, Employee o2) {
        Integer a1 = o1.age;
        Integer a2 = o2.age;

        return a1.compareTo(a2);
    }
}
