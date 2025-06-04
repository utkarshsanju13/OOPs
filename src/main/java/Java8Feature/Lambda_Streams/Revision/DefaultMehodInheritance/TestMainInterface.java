package Java8Feature.Lambda_Streams.Revision.DefaultMehodInheritance;

public class TestMainInterface implements TestInterface1,TestInterface2 {

    public void show() {
        TestInterface1.super.show();
        TestInterface2.super.show();
    }
}
