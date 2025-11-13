package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.Synchronization.AdderSubstractorUsingSynchronizedKeyword;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    Value v;

    Adder(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {

        for(int i = 0 ; i < 10000; i++){
            synchronized (v){
                this.v.value += i;
            }

        }

        return null;
    }
}
