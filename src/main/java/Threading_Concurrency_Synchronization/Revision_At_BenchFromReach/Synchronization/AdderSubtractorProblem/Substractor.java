package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.Synchronization.AdderSubtractorProblem;

import java.util.concurrent.Callable;

public class Substractor implements Callable<Void> {

    Value v;

    Substractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0; i<10000; i++) {
            this.v.value -= i;
        }

        
        return null;
    }
}
