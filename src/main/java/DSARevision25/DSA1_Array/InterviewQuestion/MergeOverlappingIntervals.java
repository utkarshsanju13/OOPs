package DSARevision25.DSA1_Array.InterviewQuestion;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {

        int arr[][] = {{7,8},{1,5},{2,4},{4,6}};

//        ArrayList<int[]> res = mergeOverlapOptimize(arr);
//        for(int [] a: res){
//            System.out.print("("+a[0]+","+a[1]+")");
//        }

        int[][] result = mergeOverlapOptimizenew(arr);


    }

    public static int[][] mergeOverlapOptimizenew(int [][] arr){

        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[]{arr[0][0],arr[0][1]});

        for(int i = 1; i < arr.length; i++){
            int newStart = arr[i][0];
            int newEnd = arr[i][1];
            int currStart = result.get(result.size()-1)[0];
            int currEnd = result.get(result.size()-1)[1];

            if(newStart <= currEnd){
                result.get(result.size()-1)[1] = Math.max(currEnd,newEnd);
//                result.set(result.size()-1,new int[]{currStart,Math.max(currEnd,newEnd)});
            }else{
                result.add(new int[]{newStart,newEnd});
            }
        }

        return result.toArray(new int[result.size()][]);
    }


    public static ArrayList<int[]> mergeOverlapOptimize(int [][] arr){

        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[]{arr[0][0],arr[0][1]});

        for(int i = 1; i < arr.length; i++){
            int newStart = arr[i][0];
            int newEnd = arr[i][1];
            int currStart = result.get(result.size()-1)[0];
            int currEnd = result.get(result.size()-1)[1];

            if(newStart <= currEnd){
                result.get(result.size()-1)[1] = Math.max(currEnd,newEnd);
//                result.set(result.size()-1,new int[]{currStart,Math.max(currEnd,newEnd)});
            }else{
                result.add(new int[]{newStart,newEnd});
            }
        }

        return result;
    }

    public static ArrayList<int[]> mergeOverlap(int[][] arr){

        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        int n = arr.length;

        for(int i = 0 ; i < n; i++){

            int start = arr[i][0];
            int end = arr[i][1];

            if(!res.isEmpty() && res.get(res.size()-1)[1] >= end)
                continue;

            for(int j = i+1; j < n; j++){
                if(arr[j][0] <= end){
                    end = Math.max(arr[j][1],end);
                }
            }
            res.add(new int[]{start,end});
        }


        return res;
    }
}
