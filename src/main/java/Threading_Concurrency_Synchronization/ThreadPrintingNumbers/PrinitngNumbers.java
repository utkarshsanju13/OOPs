package Threading_Concurrency_Synchronization.ThreadPrintingNumbers;

import Assignment.P;

class PrintNumber{
    int value = 1;

    public synchronized void printOdd() throws InterruptedException {

        while(value <= 100){
            if(value %2 == 0){
                wait();
            }
            System.out.print(value + " ");
            value++;
            notify();
        }
    }

    public synchronized void printEven() throws InterruptedException {

        while(value <= 100){
            if(value %2 != 0){
                wait();
            }
            System.out.print(value + " ");
            value++;
            notify();
        }
    }
}
public class PrinitngNumbers {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        Thread t1 = new Thread(()->{

            for(int i = 0; i < 50; i++){
                try {
                    p.printOdd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0; i < 50; i++){
                try {
                    p.printEven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
