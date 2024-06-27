package org.example;

public class reverseWord {

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseW(s));
    }

    public static String reverseW(String s) {

//        String[] splited = s.split("\\s+");
//
//        StringBuilder ans = new StringBuilder();
//
//        for(int i = splited.length-1; i>0; i--){
//            ans.append(splited[i]);
//            ans.append(" ");
//        }
//
//        ans.append(splited[0]);
//
//
//
//            return ans.toString();


        char[] str  = s.toCharArray();
        char[] res = new char[s.length()+1];

        int l =  s.length() - 1;
        int j;
        int k = 0;

        while(l>=0){
            while(l>=0 && str[l] == ' '){
                l--;
            }
            if(l<0) break;
            j = l;
            while(l>=0 && str[l]!=' '){
                l--;
            }
            for(int i = l+1;i<=j;i++){
                res[k++] = str[i];
            }
            res[k++] = ' ';
        }
        return new String(res, 0 ,k-1);
    }
}
