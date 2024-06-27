package Threading_Concurrency_Synchronization.Assignmentp1Of2class;

public class Adder implements  Runnable{
    int a;
    int b;
    Adder(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        System.out.println(a+b);
    }
}
