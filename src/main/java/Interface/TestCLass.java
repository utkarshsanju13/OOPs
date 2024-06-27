package Interface;

public class TestCLass implements TestInterface1 {


    @Override
    public void nonstaticMethod() {
        System.out.println("non static method from class");
    }

//    static void staticMethod() {
//        System.out.println("Static method in Testclass");
//    }

    public static void main(String[] args) {

        TestCLass obj = new TestCLass();
//        obj.nonstaticMethod();
        obj.deafultMethod();

        TestInterface1.staticMethod(); // intefrace method

        TestInterface1 obj1 = new TestCLass();
//        obj1.staticMethod();

        TestInterface1.staticMethod();
//        TestCLass.staticMethod();





    }
}
