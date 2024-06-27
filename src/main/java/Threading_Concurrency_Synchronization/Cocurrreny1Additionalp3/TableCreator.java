package Threading_Concurrency_Synchronization.Cocurrreny1Additionalp3;

public class TableCreator implements Runnable{
//    int n;
//
//    public TableCreator(int n) {
//        this.n = n;
//    }
//
//    @Override
//    public void run() {
//        for(int i = 1; i <=10; i++){
//            System.out.println(i+ " times " + n + " is " + n * i);
//        }
//    }

    private int x;

    //constructor to initialise the x
    public TableCreator(int x){
        this.x = x;
    }

    // implementing run function to print table of 1-10 for the passed i or x number
    public void run(){
        for(int i=1;i<=10;i++){
//            System.out.println(x + " times “+ i +” is " + (x*i));
            System.out.println(x+ " times " + i + " is " + (x* i));
        }
    }
}
