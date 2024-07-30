package Threading_Concurrency_Synchronization.ThreadCreationBasic;

public class NewThread extends Thread{

    @Override
    public void run() {
        System.out.println("Hello from NewThread");
        doSomething();
    }

    public static void doSomething(){
        System.out.println("Hello From do Something");
    }

    public static void main(String[] args) {

        NewThread thread = new NewThread();
        thread.start();

        System.out.println("hello from main");
    }
}
