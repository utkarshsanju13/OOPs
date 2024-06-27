package Static_FInal;

public class User {

    public static final String galaxy = "Milky-Way";
    public final String bloodGroup ;

    public User(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public static void staticMethod(){
        System.out.println("Only static method method from User class");
    }

    public final void finalMethod(){
        System.out.println("Omly final method from User class");
    }

    public static final void staticFinalMehod(){
        System.out.println("Static final method method from User class");
    }
}
