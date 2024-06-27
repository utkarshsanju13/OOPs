package Inheritance;

public class Child  extends Parent{

    public void greet(){
        System.out.println("Greet from Child");
    }

    public void greetOnlyFromChild(){
        System.out.println("greetOnlyFromChild from Child");
    }
}
