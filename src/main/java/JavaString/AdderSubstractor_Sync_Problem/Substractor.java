package JavaString.AdderSubstractor_Sync_Problem;

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
            if(v.str.length()-1 > 0)
            this.v.str.deleteCharAt(v.str.length()-1);
        }

        return null;
    }
}
