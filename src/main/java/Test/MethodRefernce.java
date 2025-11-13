package Test;

import java.util.stream.Collector;
import java.util.stream.Collectors;

interface Sayable{
    void say();
}
public class MethodRefernce {
    public static void SaySomething(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {

        Sayable s = MethodRefernce::SaySomething;
        s.say();
//        Collectors.summarizingDouble()
    }

}
