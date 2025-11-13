package DSARevision25.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode6_ZigZagConversion {

    public static void main(String[] args) {

        String str = "PAYPALISHIRING";
        System.out.println(convert(str,4));
        System.out.println(convertOptimize(str,4));
    }

    public static String convertOptimize(String s, int numRows){

        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i < numRows; i++){


            int idx = i;
            int downnext = 2 * ( numRows - i - 1);
            int upnext = 2 * i;
            boolean down = true;
            while (idx < s.length()){
                str.append(s.charAt(idx));
                if(i == 0){
                    idx += downnext;
                }else if( i == numRows -1){
                    idx += upnext;
                }else {
                    if (down) {
                        idx += downnext;
                    } else {
                        idx += upnext;
                    }
                    down = !down;
                }
            }
        }

        return str.toString();
    }

    public static String convert(String s, int numRows) {

        List<List<Character>> tempAns = new ArrayList<>();
        for(int i = 0 ; i < numRows; i++){
            tempAns.add(new ArrayList<Character>());
        }
        int idx = 0;
        int down = 1;

        for(int i = 0 ; i < s.length(); i++){
            tempAns.get(idx).add(s.charAt(i));
            if(idx == 0){
                down = 1;
            } else if(idx == numRows-1){
                down = -1;
            }
            idx += down;
        }

        StringBuilder ans = new StringBuilder();

        for(List<Character> row : tempAns){
            for(int i = 0; i < row.size(); i++){
                ans.append(row.get(i));
            }
        }
        return ans.toString();
    }
}
