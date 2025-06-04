package Java8Feature.Lambda_Streams.MethodReference;

public class MethodReferenceTest {

    public MethodReferenceTest(){
        System.out.println("MethodReferenceTest Constructor method");
    }

    public static void main(String[] args) {


        Sayable sayableStaticMethod  = MethodReferenceTest::SaySomething;
        sayableStaticMethod.say();

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        Sayable instanceSayable = methodReferenceTest::SaySomethingElseInstanceMethod;

        Sayable constructorSayable = MethodReferenceTest::new;
        constructorSayable.say();


    }


    public static void SaySomething() {
        System.out.println("SaySomething");
    }

    public void SaySomethingElseInstanceMethod() {
        System.out.println("SaySomethingElseInstanceMethod");
    }


}
