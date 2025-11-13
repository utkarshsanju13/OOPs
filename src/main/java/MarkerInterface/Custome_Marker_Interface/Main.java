package MarkerInterface.Custome_Marker_Interface;

public class Main {
    public static void main(String[] args) {

        Object obj1 = new User();
        Object obj2 = new Guest();

        checkAccess(obj1);
        checkAccess(obj2);
    }

    public static void checkAccess(Object obj){
        if(obj instanceof Secured){
            System.out.println("Access Granted : " + obj.getClass().getSimpleName());
        }else {
            System.out.println("Access not granted : " + obj.getClass());
        }
    }
}
