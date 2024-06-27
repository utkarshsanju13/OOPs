package Interface;

public interface TestInterface1 {

    int a = 10; //default static final

    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    default void deafultMethod() {
        System.out.println("default method in interface");
    }

    void nonstaticMethod();

}
