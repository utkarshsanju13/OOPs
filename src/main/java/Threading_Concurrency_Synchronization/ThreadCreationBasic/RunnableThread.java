package Threading_Concurrency_Synchronization.ThreadCreationBasic;

public class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from RunnableThread");
//        try {
//            Thread.sleep(3333);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        //DO somethinf is not printed in output as t.interupt is called
        doSomething();
    }

    public static void doSomething(){
        System.out.println("Hello From do Something");
    }

}
