package Interface;

public class ClassTest implements Interface2,Interface1{

    @Override
    public void show() {
        Interface2.super.show();
        Interface1.super.show();
    }

    public void show2(){
        Interface2.super.show();
        Interface1.super.show();
    }

    public static void main(String[] args) {

        ClassTest c = new ClassTest();

    }
}
