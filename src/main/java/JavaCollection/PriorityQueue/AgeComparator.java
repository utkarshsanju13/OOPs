package JavaCollection.PriorityQueue;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        Integer a1 = o1.age;
        Integer a2 = o2.age;

        return a1.compareTo(a2);
    }
}
