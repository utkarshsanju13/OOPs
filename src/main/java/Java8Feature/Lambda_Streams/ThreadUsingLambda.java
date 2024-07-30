package Java8Feature.Lambda_Streams;

public class ThreadUsingLambda {

    public static void main(String[] args) {
        DoSomething doSomething = new DoSomething();
        Thread t = new Thread(doSomething);
        t.start();

        //Using lambda Expression
        Runnable r  = ()->{
            System.out.println("Do Something....v2");
        };

        Thread t2 = new Thread(r);
        t2.start();

        Thread t3 = new Thread(
                ()->{
                    System.out.println("Do Something....v3");
                }
        );

        t3.start();
    }
}
