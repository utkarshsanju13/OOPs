package Interface.ClassExtendAndImplementBothCase;

public class Main extends MyClass implements MyInterface{

    //both class and interface having same name method , So override is mandatory
    @Override
    public void defaultMethod() {
        MyInterface.super.defaultMethod();//to access the interface method we use first statement
        super.defaultMethod();//to access the class method we use only super.defaultMethod()
    }

    @Override
    public void instanceMethod() {

    }

    public static void main(String[] args) {

        Main m = new Main();
        m.defaultMethod();

    }


}
