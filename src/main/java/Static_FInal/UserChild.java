package Static_FInal;

public class UserChild extends User{

    public UserChild(String bloodGroup) {
        super(bloodGroup);
    }

    public static void staticMethod(){
        System.out.println("Only static method method from UserChild class");
    }

//    public final void finalMethod(){
//        System.out.println("Only final method from UserChild class");
//    }
    //Note: can't override the final method

//    public static final void staticFinalMehod(){
//        System.out.println("Static final method method from User class");
//    }
    //Note: can't override the static final method
}
