package Threading_Concurrency_Synchronization;

public class Main {

    //In this case only a single thread is created
    public static void main(String[] args) {
//        int a =10;
//        int b = 20;
//        doSomething();  //Run by main thread
//        System.out.println("Hello World !" + Thread.currentThread().getName());

    }

    public static  void doSomething(){

        int c = 2;
        int d  =5;

        System.out.println("do Something " + Thread.currentThread().getName());}  //Run by main Thread
}
