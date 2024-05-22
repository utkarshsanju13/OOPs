package OOPs_2_Constructor_And_Access_Modifier;

class Test{
    int x,  y;
}

public class CopyConstructorUsingCloneMethod implements Cloneable {

    int a;
    int b;
    Test c = new Test();

//    For shallow Copy
//    public Object clone() throws CloneNotSupportedException{
//        return  super.clone();
//    }

    //FOr Deep Copy
    public Object clone() throws CloneNotSupportedException{

        CopyConstructorUsingCloneMethod obj = (CopyConstructorUsingCloneMethod) super.clone();
        Test copy = new Test();
        obj.c = copy;

        return obj;

    }

    public static void main(String[] args) throws  CloneNotSupportedException {

        CopyConstructorUsingCloneMethod org = new CopyConstructorUsingCloneMethod();
        org.a = 10;
        org.b = 20;

        System.out.println("Original Object :" +org.a+ " "+org.b+ " "+ org.c);

        CopyConstructorUsingCloneMethod copyorg = (CopyConstructorUsingCloneMethod) org.clone();

        // See the output the object c in class level variable has same reference as original
        //To avoid this we create a deep copy
        //Use deepCopy constructor , THen the reference variable is different
        System.out.println("Original Object :" +copyorg.a+ " "+copyorg.b+ " "+ copyorg.c);
    }






}





