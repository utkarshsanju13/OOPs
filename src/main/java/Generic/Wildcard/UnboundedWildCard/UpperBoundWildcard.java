package Generic.Wildcard.UnboundedWildCard;

import java.util.List;

public class UpperBoundWildcard {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5);
        List<Double> list1 = List.of(1.1,1.3,1.5);
        System.out.println(sumOfList(list));
        System.out.println(sumOfList(list1));

    }

    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        for(Number n: list){
            s+= n.doubleValue();
        }
        return  s;
    }

    public static <T extends  Number> T sumOfList1(List<T> list){
        double s = 0.0;
        for (T n : list)
            s += n.doubleValue();
        return (T) Double.valueOf(s);
    }


}
