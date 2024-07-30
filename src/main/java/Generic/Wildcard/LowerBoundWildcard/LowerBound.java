package Generic.Wildcard.LowerBoundWildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        addNumatlast(integerList);

        List<Number> numberListList = new ArrayList<>();
        addNumatlast(numberListList);

        List<Object> objectList = new ArrayList<>();
        addNumatlast(objectList);

        System.out.println(integerList);
        System.out.println(numberListList);
        System.out.println(objectList);

    }

    public static void addNumatlast(List<? super Integer> li){

        for(int i = 1; i<=10; i++){
            li.add(i);
        }
    }

    void foo(List<?> i) {
        fooHelper(i);
    }

    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }

//    public <T,K> void swapFirst(List<T extends Number> l1, List<K extends Number> l2) {
//        T temp = l1.get(0);
////        l1.set(0, l2.get(0)); // expected a CAP#1 extends Number,
//        // got a CAP#2 extends Number;
//        // same bound, but different types
////        l2.set(0, temp);	    // expected a CAP#1 extends Number,
        // got a Number
    }

//}
