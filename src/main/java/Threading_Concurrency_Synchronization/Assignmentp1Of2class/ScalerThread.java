package Threading_Concurrency_Synchronization.Assignmentp1Of2class;

import java.util.HashMap;

//public class ScalerThread {
//}
public class ScalerThread extends Thread {
    public static HashMap<String, String> map = new HashMap<>();
    private String target;

    ScalerThread(Runnable r){
        super(r);
        target = r.getClass().getName();
    }

    @Override
    public void start() {
        super.start();
        map.put(target, this.getName());
    }
}
