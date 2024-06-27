package Interface.ClassExtendAndImplementBothCase;

public interface MyInterface {

    public static void staticMethod(){
        System.out.println("static method of Interface");
    }

    default void defaultMethod(){
        System.out.println("default method of Interface");
    }

    public void instanceMethod();
}
