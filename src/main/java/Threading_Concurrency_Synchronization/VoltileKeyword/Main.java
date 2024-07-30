package Threading_Concurrency_Synchronization.VoltileKeyword;



public class Main {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();


        Thread A = new Thread(()->{
            //After 2S, toggle the value
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            sharedResource.toggleFlag();
            System.out.println("Thread A is finished, Flag is "+sharedResource.getFlag());
        });

        Thread B = new Thread(()->{
            while(!sharedResource.getFlag()){
                //...busy-wait...
//                 System.out.println("Inside Loop " + sharedResource.getFlag());

            }
            System.out.println("In Thread B, Flag is "+sharedResource.getFlag());
        });

        A.start();
        B.start();

    }
}
