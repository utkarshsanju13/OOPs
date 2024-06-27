package Interface;

public class Interface3 implements Interface1,Interface2{

    @Override
    public void show() {
        Interface1.super.show();
        Interface2.super.show();
    }

}
