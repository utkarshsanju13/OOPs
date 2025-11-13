package DSARevision25.DSA1_Array.InterviewQuestion;


import java.util.ArrayList;
import java.util.List;

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }

public class MergeInterval {

    public static void main(String[] args) {

        ArrayList<Interval> list = new ArrayList<>(List.of(
                new Interval(1,3),
                new Interval(6,9)
        ));

        Interval newInterval = new Interval(2,5);

        ArrayList<Interval> res  = insert(list,newInterval);
        for(Interval interval:res){
            System.out.print("(" + interval.start +","+interval.end+")");
        }
    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        int L = newInterval.start;
        int R = newInterval.end;

        ArrayList<Interval> result = new ArrayList<Interval>();

        for(int i = 0; i < intervals.size(); i++){

            if(intervals.get(i).end < L){

                result.add(new Interval(intervals.get(i).start, intervals.get(i).end));
            }else if(intervals.get(i).start > R){
                result.add(new Interval(L,R));

                for(int j = i; j < intervals.size(); j++){
                    result.add(new Interval(intervals.get(j).start, intervals.get(j).end));
                }
                return result;
            }else{
                L = Math.min(intervals.get(i).start,L);
                R = Math.max(intervals.get(i).end,R);
            }
        }

        result.add(new Interval(L,R));
        return result;

    }}
