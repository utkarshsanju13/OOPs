package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Is_Dictionary {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(List.of(
                "hello", "scaler", "interviewbit"
        ));
        String order = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(solve(str,order));
    }

    public static int solve(ArrayList<String> A, String B) {

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < B.length(); i++){
            hm.put(B.charAt(i),i);
        }

        int n = A.size();
        for(int j = 1; j < n; j++){
            String first = A.get(j-1);
            String next = A.get(j);
            int minLen = Math.min(first.length(),next.length());
            int equalChar= 0;

            for(int i = 0 ; i < minLen; i++){

                if(hm.get(first.charAt(i)) > hm.get(next.charAt(i)))
                    return 0;
                else if(hm.get(first.charAt(i)) == hm.get(next.charAt(i))){
                    equalChar++;
                }else{
                    break;
                }
            }

            if(equalChar == minLen && first.length() > next.length())
                return 0;
        }

        return 1;
    }
}
