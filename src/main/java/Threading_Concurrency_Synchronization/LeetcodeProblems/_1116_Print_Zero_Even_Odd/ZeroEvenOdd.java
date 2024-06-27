package Threading_Concurrency_Synchronization.LeetcodeProblems._1116_Print_Zero_Even_Odd;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class ZeroEvenOdd {
    private int n;
    private Semaphore zeroSemaphore = new Semaphore(1);
    private Semaphore oddSemaphore = new Semaphore(0);
    private Semaphore evenSemaphore = new Semaphore(0);
    private int curr;


    public ZeroEvenOdd(int n) {
        this.n = n;
        this.curr = 1;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while(curr <= n ){
            zeroSemaphore.acquire(); //start with zeroSemaphore to acquire
            if (curr > n) break;  //check at any point of time if curr > n it should break (beacuse curr is modified from other thread as well)
            printNumber.accept(0);
            if(curr % 2 != 0){  //if next number i.e. curr is odd
                oddSemaphore.release(); //relase odd if curr is odd
            }else{
                evenSemaphore.release();//else release even
            }
        }
        //at last if any of the sempahore are in waiting stage release them
        oddSemaphore.release();
        evenSemaphore.release();
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while( curr <= n){
            evenSemaphore.acquire();
            if (curr > n) break;
            printNumber.accept(curr);
            curr++;
            zeroSemaphore.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while( curr <= n){
            oddSemaphore.acquire();
            if (curr > n) break;
            printNumber.accept(curr);
            curr++;
            zeroSemaphore.release();
        }
    }
}
