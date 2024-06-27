package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main{

    public static void main(String[] args) {
//        String num1 = "12";
//        String num2 = "19";
//
////        System.out.println(multiply(num1,num2));
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//
//        long startTime = System.nanoTime();
//        arr.remove(arr.size()-1);
//        long endTime = System.nanoTime();
//        System.out.println(endTime - startTime);
//
//         startTime = System.nanoTime();
//        arr.remove(3);
//         endTime = System.nanoTime();
//        System.out.println(endTime - startTime);


        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int size = 1000000; // One million elements

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

        // Measure time taken to remove an element from the middle
        int middleIndex = size / 2;

        long startTime = System.nanoTime();
        list.remove(middleIndex);
        long endTime = System.nanoTime();
        long durationMiddle = endTime - startTime;

        System.out.println("Time taken to remove element from the middle: " + durationMiddle + " nanoseconds");

        // Measure time taken to remove an element from the last
        int lastIndex = list.size() - 1;

        startTime = System.nanoTime();
        list.remove(lastIndex);
        endTime = System.nanoTime();
        long durationLast = endTime - startTime;

        System.out.println("Time taken to remove element from the last: " + durationLast + " nanoseconds");




    }

public static String multiply(String num1, String num2) {

    int[] arr = new int[num1.length()+num2.length()];


    for(int i = num1.length()-1; i >= 0; i--) {

        int carry = 0;
        for(int j = num2.length()-1; j >= 0; j--) {
            arr[i+j+1] += carry + (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
            carry = arr[i+j+1] / 10;
            arr[i+j+1] %= 10;
        }
        arr[i] = carry;
    }
    StringBuilder builder = new StringBuilder();
    int i = 0;
    while(i < arr.length && arr[i] == 0) i++;
    if(i >= arr.length) {
        return "0";
    }

    for(int j = i; j < arr.length; j++) {
        builder.append(arr[j]);
    }

    return builder.toString();
}
}

