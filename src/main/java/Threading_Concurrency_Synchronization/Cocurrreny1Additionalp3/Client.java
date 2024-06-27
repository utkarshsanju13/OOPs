package Threading_Concurrency_Synchronization.Cocurrreny1Additionalp3;

import java.util.Scanner;

public class Client {



    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        for(int i = 1; i <= a; i++){
//            TableCreator tb = new TableCreator(i);
//            ScalerThread scj = new ScalerThread(tb);
//            scj.start();
//        }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //  creating 1-n threads and for each i we are running thread to print table(1-10) of that i
        for(int i=1;i<=n;i++){
            TableCreator tab = new TableCreator(i);

            ScalerThread t = new ScalerThread(tab);
            t.start();
        }
    }
}

/*
Write code to achieve the following
A class Client with a main method.
Client class shall take a number n as input.
A class called TableCreator which prints the multiplication table from 1 to 10 for a given number x
x times 1 is x

..

x times 10 is 10x
Client should create a thread for every number between 1 to n, n included and
Pass it to TableCreator to print a multiplication table for that number.
Print format = 2 times 6 is 12
*/
