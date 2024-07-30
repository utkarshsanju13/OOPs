package Generic.RawAndGenericType;

public class RawBox {

    Object t;

    public RawBox(Object t) {
        this.t = t;
    }

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

    public static void main(String[] args) {

        RawBox box = new RawBox(12);
        System.out.println(box.getT());
        box.setT("34");
        Integer i = (Integer) box.getT(); //this is not giving any compile time
        //it will throw a runtime exception: ClassCastException
        System.out.println(box.getT().getClass().getName());




    }
}
