package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ThreadFunction;


import Threading_Concurrency_Synchronization.ThreadPool.NumberPrinter;

public class NumberPrinterUsingTwoThreadOddEvenNumber {

    int value = 1;
    public synchronized void printEven() throws InterruptedException {

        while(value <= 100){

            if(value % 2 != 0){
                wait();
            }
            System.out.println("Value from even thread : " + value++);
            notify();
        }
    }

    public synchronized void printOdd(){
    try{
        while(value <= 100){

            if(value % 2 == 0){
                wait();
            }
            System.out.println("Value from odd thread : " + value++);
            notify();
        }
    }catch (InterruptedException e){
        e.printStackTrace();
    }

    }

    public static void main(String[] args) {

        NumberPrinterUsingTwoThreadOddEvenNumber numberPrinter = new NumberPrinterUsingTwoThreadOddEvenNumber();
//        Thread oddPrint = new Thread(()->{
//            try {
//                for(int i = 0 ; i < 50; i++){
//                    numberPrinter.printOdd();
//                }
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });

        //using method reference
        Thread  oddPrint = new Thread(numberPrinter::printOdd);

        Thread evenPrint = new Thread(()->{
            try {
                for(int i = 0 ; i < 50; i++) {
                    numberPrinter.printEven();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        oddPrint.start();
        evenPrint.start();



    }


}
