package DSARevision25.Leetcode;

import java.util.HashMap;

public class LeetCode340_LongestSubWithAtMostKDIstictElement {

    public static void main(String[] args) {
        String str = "aabcbcdbca";
        System.out.println(longestSubstringWithAtMostKDistictElement(str,2));

    }

    public static String longestSubstringWithAtMostKDistictElement(String str, int k){

        int slow = 0;
        int fast = 0;
        int maxSize = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(fast);
            hm.put(ch, hm.getOrDefault(ch,0) +1);

            while(hm.size() > k){

                char d = str.charAt(slow);
                if(hm.get(d) == 1){
                    hm.remove(d);
                }else{
                    hm.put(d,hm.get(d)-1);
                }
                slow++;
            }

            if(maxSize < fast - slow + 1){
                maxSize = fast - slow +1;
                ans.setLength(0);
                ans.append(str,slow,fast +1);
//                ans = str.substring(slow,fast);
            }
            fast++;
        }
        return ans.toString();
    }

}
