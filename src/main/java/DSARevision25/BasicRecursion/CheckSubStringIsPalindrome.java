package DSARevision25.BasicRecursion;

public class CheckSubStringIsPalindrome {

    public static void main(String[] args) {
        String str = "mamadamb";
        System.out.println(checkSubStringPalidrome(2,6,str));
    }

    public static boolean checkSubStringPalidrome(int s, int e, String str){

        if(s >= e)
            return  true;

        return str.charAt(s) == str.charAt(e) && checkSubStringPalidrome(s+1,e-1,str);
    }

}
