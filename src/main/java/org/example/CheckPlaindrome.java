package org.example;

public class CheckPlaindrome {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";

        System.out.print(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){

        char[] chr = str.toLowerCase().toCharArray();
        int left = 0;
        int right = chr.length - 1;

        while(left < right){

            while(left < right && !Character.isLetterOrDigit(chr[left])){
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(chr[right])){
                right--;
            }

            if(chr[left] != chr[right])
                return false;

            left++;
            right--;
        }

        return true;

    }

}
