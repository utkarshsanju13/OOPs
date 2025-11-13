package DSARevision25.BasicRecursion;

import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(reverse(str,str.length()-1));

    }

    public static String reverse(String str, int ptr){

        if(ptr < 0){
            return "";
        }

        return str.charAt(ptr) + reverse(str,--ptr);
    }
}
