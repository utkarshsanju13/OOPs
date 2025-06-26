package Assignment;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface NonNull {}


public class TypeAnnotationDemo {


    public void process( @NonNull String str){
        System.out.println("print form the process function data = " + str);
    }

    public static void main(String[] args) {

        TypeAnnotationDemo demo = new TypeAnnotationDemo();
        demo.process("Hello");
        demo.process(null);
    }
}
