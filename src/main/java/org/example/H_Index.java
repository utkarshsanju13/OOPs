package org.example;

import java.util.Arrays;

public class H_Index {

    public static void main(String[] args) {
//        int arr[] = {0,1,3,5,6};
        int arr[] = {11,15};
        System.out.print(hIndex(arr));
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h=0;
        for(int i=citations.length-1;i>=0;i--){
            // System.out.println(h+" - "+citations[i]);
            if(h+1 > citations[i]){
                return h;
            }
            h++;
        }
        return h;
    }
}
