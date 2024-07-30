package Generic.TypeInference.TargetType;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Object> list = Collections.emptyList();
        processListOfString(Collections.emptyList());
        processListOfInteger(Collections.emptyList());
//        processListOfString(list);
    }

    public static void processListOfInteger(List<Integer> list){
        list.add(1);
//        list.add("Jello");//It gives compile time error
        System.out.println(list.getClass().getName());
        //do something
    }

    public static void processListOfString(List<String> list){
//        list.add(1); //It gives compile time error
        list.add("Jello");
        System.out.println(list.getClass().getName());

    }
}
