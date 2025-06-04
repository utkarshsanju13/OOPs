package Java8Feature.Lambda_Streams.Revision;

@FunctionalInterface
public interface MathOperation  {

    public int operation(int a, int b);

    default void print() {
        System.out.println("hello world from MathOperation default method");
    }

    static void printFromStaticMethod() {
        System.out.println("hello world from MathOperation static method ");
    }
}
