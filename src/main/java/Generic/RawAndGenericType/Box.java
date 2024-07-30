package Generic.RawAndGenericType;



public class Box<T> {
    // T stands for "Type"
    private T t;

    public Box() {
    }

    public Box(T t) {
        this.t = t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {

//        Box<Integer> b = new Box<>(12);
//        System.out.println(b.get());
//        b.set(34);
//        System.out.println(b.get());

        Box<Integer> intBox = new Box<>(12);
        Box rawBox = intBox;
        rawBox.set("hello");
        System.out.println(rawBox.get().getClass().getName());

//        Box rawBox1 = new Box();
//        Box<Integer> genBOx1 = rawBox1;



    }
}

