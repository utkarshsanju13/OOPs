package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestJustification {

    public static void main(String[] args) {

        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> res = fullJustify(words,16);

        for(String str : res){
            System.out.println(str);
        }

    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        ArrayList<String> res = new ArrayList<>();
        int n=words.length,
                len=0, s=0, wl=0;
        boolean newline=true;

        for(int i=0; i<n; ++i) {
            len+=words[i].length();

            if(newline)
                newline=false;
            else
                len+=1;

            if(len>maxWidth) {
                res.add(justified(s,i,words,maxWidth,wl));
                s=i;
                len=words[i].length();
                wl=0;
            }

            if(i==n-1)
                res.add(leftAligned(s,i+1,words,maxWidth,wl+words[i].length()));
            wl+=words[i].length();
        }
        return res;
    }
    private static String justified(int start, int end, String[] words, int maxWidth, int l) {
        if(end-start==1) return leftAligned(start, end, words, maxWidth, l);
        int extraSpace=maxWidth-l, eachSpace;
        char[] str=new char[maxWidth];
        for(int i=0;
            start<end;
            i+=eachSpace+words[start].length(), extraSpace-=eachSpace, ++start) {
            eachSpace=(int)Math.ceil((double)extraSpace/(end-start-1));
            if(start==end-1) eachSpace=0;
            paste(words[start], i, eachSpace, str);
        }
        return new String(str);
    }
    private static String leftAligned(int start, int end, String[] words, int maxW, int l) {
        char[] str=new char[maxW];
        for(int i=0;start<end;i+=words[start].length()+1, ++start)
            paste(words[start], i, start==(end-1)?maxW-(i+words[start].length()):1, str);
        return new String(str);
    }
    private static  void paste(String w, int i, int space, char[] str) {
        for(int j=0;j<w.length(); str[i++]=w.charAt(j), ++j);
        while(space-->0) str[i++]=' ';
    }
}
