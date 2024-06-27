package Threading_Concurrency_Synchronization.LeetCodeProblemOnConcurrency.LeetCode1117;

import java.util.concurrent.Semaphore;

class H2O {

    private Semaphore hSema = new Semaphore(2);
    private Semaphore oSema = new Semaphore(0);

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hSema.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();

        oSema.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oSema.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        hSema.release(2);
    }
}
