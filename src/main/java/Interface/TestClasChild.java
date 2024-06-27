package Interface;

public class TestClasChild extends TestCLass{

//    static void staticMethod() {
//        System.out.println("Static method in TestclassChild");
//    }


    public static void main(String[] args) {

        TestClasChild obj2 = new TestClasChild();
//        obj2.staticMethod();  // TestClasChild.staticMethod();

//        TestCLass.
//        TestCLass obj3 = new TestClasChild();
//        obj3.staticMethod();  //method hiding --> testClass method

        TestInterface1 obj4 = new TestClasChild();
//        obj4.staticMethod();






    }
}
