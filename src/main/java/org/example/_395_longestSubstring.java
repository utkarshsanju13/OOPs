package org.example;

import java.util.HashMap;
import java.util.Map;

public class _395_longestSubstring {

    public static void main(String[] args) {

        String str = "ababbc";
        System.out.println(longestSubstring(str, 2));
    }

    public static int longestSubstring(String str, int k) {

        int i = 0;
        int j = 0;
        int n = str.length();

        Map<Character, Integer> hm = new HashMap<>();

        while(j < n){

            char ch = str.charAt(j);

        }

        return 0;
    }
}
