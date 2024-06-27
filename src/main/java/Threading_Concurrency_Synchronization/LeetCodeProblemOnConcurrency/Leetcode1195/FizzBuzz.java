package Threading_Concurrency_Synchronization.LeetCodeProblemOnConcurrency.Leetcode1195;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    private int curr;
    private Semaphore fSema;
    private Semaphore bSema;
    private Semaphore fbSema;
    private Semaphore numSema;

    public FizzBuzz(int n) {
        this.n = n;
        this.curr = 1;
        this.fSema = new Semaphore(1);
        this.bSema = new Semaphore(1);
        this.fbSema  = new Semaphore(1);
        this.numSema = new Semaphore(1);
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(curr <= n){
            if(curr % 3 == 0 && curr % 5 != 0){
                fSema.acquire();
                if(curr > n) break;
                printFizz.run();
                curr++;
                fSema.release();
            }
        }

    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(curr <= n){
            if(curr % 5 == 0 && curr % 3 != 0){
                numSema.acquire();
                if(curr > n) break;
                printBuzz.run();
                curr++;
                numSema.release();
            }
        }

    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(curr <= n){
            if(curr % 3 == 0 && curr % 5 == 0){
                fbSema.acquire();
                if(curr > n) break;
                printFizzBuzz.run();
                curr++;
                fbSema.release();
            }
        }

    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {

        while(curr <= n){
            if(curr % 3 != 0 && curr % 5 != 0){
                numSema.acquire();
                if(curr > n) break;
                printNumber.accept(curr);
                curr++;
                numSema.release();
            }
        }

    }
}
