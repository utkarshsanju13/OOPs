package Volatile;

class ShrareResource{
    volatile boolean flag = false;

    void setFlag(){
        flag = true;
    }

    boolean getFlag(){
        return flag;
    }
}
public class VolatileKeyword {

    public static void main(String[] args) throws InterruptedException {

        ShrareResource s = new ShrareResource();

        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        s.setFlag();
        System.out.println("Set the flag value to true");

        Thread t2 = new Thread(()->{
            while(!s.getFlag()){

            }
        });
        System.out.println("flag value is set to true");
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }



}
