package Threading_Concurrency_Synchronization.VoltileKeyword;

public class SharedResource {

    private volatile boolean flag;

    public SharedResource() {
        this.flag = flag;
    }

    public void toggleFlag(){
        this.flag = !flag;
    }

    public boolean getFlag(){
        return flag;
    }


}
