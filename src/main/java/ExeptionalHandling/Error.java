package ExeptionalHandling;

public class Error {

    public static void recur(int a){

        //We can catch error as well
        try{
            recur(a * a);
        }catch (StackOverflowError e){
            System.out.println("Error Occured");
//            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Error.recur(1);

    }
}
