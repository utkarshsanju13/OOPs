package JavaString.AdderSubstractor_Sync_Problem;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;

    public Adder(Value v) {
        this.v = v;
    }
    @Override
    public Void call() throws Exception {
        for(int i =1; i <= 100000; i++){
//            this.v.val+=i;
            this.v.str.append("a");
        }
        return null;
    }
}
