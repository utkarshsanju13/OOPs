package org.example;

public class _1358NumberOfSubstringsContainingAllThreeCharacters {

    public static void main(String[] args) {
        String str = "abcabc";

        System.out.println(numberOfSubstrings(str));
    }

    public static int numberOfSubstrings(String str) {

        int aCount =0,bCount =0,cCount=0;
        int res = 0;
        int s = 0,e = 0;
        int n = str.length();

        while(e < n && s < n){

            if(str.charAt(e) == 'a') aCount++;
            else if(str.charAt(e) == 'b') bCount++;
            else if(str.charAt(e) == 'c') cCount++;

            while(aCount > 0 && bCount > 0 && cCount > 0 && s < n){
                res += n - e;

                if(str.charAt(s) == 'a') aCount--;
                else if(str.charAt(s) == 'b') bCount--;
                else if(str.charAt(s) == 'c') cCount--;
                s++;
            }

            e++;
        }

        return res;

    }
}
