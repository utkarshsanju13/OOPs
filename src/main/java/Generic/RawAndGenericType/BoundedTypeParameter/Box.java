package Generic.RawAndGenericType.BoundedTypeParameter;

import Generic.RawAndGenericType.OrderedPair.Main;

public class Box<T>{
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T "+ t.getClass().getName());
        System.out.println("U "+ u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> b = new Box<>(1);
//        b.inspect("Hello"); //This gives compilation error as ,
        // a method that operates on numbers might only want to accept
        // instances of Number or its subclasses.
        b.inspect(2);
    }
}
