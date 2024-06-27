package Threading_Concurrency_Synchronization.AdderSubstractor_SynchronizedMethod;

import java.util.concurrent.Callable;

public class Substractor implements Callable<Void> {

    private Value v;
    public Substractor(Value v) {
        this.v = v;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 100000; i++){
//            this.v.val -=i;
            v.decrementBy(i);//this particular method is synchronized
        }
        return null;
    }
}
