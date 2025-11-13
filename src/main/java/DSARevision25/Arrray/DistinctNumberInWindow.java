package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DistinctNumberInWindow {

    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,1,3,4,3));
    int B = 3;
        System.out.println(dNums(arr,B));
    }

    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

        int n = A.size();

        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < B; i++){
            int ele = A.get(i);
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }
        ans.add(hm.size());

        int start = 0;
        int end = B;

        while(end < n){
            int startEle = A.get(start);
            hm.put(startEle, hm.get(startEle) -1);
            if(hm.get(startEle) == 0){
                hm.remove(startEle);
            }
            int ele = A.get(end);
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele));
            }else{
                hm.put(ele,1);
            }
            ans.add(hm.size());
            end++;
            start++;
        }

        return ans;
    }
}
