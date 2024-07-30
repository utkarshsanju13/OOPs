package Generic.RawAndGenericType.BoundedTypeParameter;

import java.util.List;

public class NaturalNumber <T extends Number>{

    private  T n;

    public NaturalNumber(T n) {
        this.n = n;
    }

    public boolean isEven(){
        return n.intValue()%2 == 0;
    }

    public static void main(String[] args) {

//        NaturalNumber<Integer> n = new NaturalNumber<>(2);
//        System.out.println(n.isEven());
//        NaturalNumber<String> n1 = new NaturalNumber<String>(3);//Its an error as it
        // restricted at instantiate  level that only the number and its subclass can create
        // an object of NuaturalNumber

        List<Integer> intList = List.of(1,2,3);
//        System.out.println(sumOfList(intList));
        System.out.println(sumOFAll(intList));
        List<Double> doubleList = List.of(1.1,2.1,3.1);
//        System.out.println(sumOfList(doubleList));
        System.out.println(sumOFAll(doubleList));
    }

    public static <T> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
//            if (e > elem)  // compiler error
                ++count;
        return count;
    }
    
    public static <U extends Number> double sumOfList(List<U> nums){
       double sum = 0.0;
        for(Number n : nums){
            sum+=n.doubleValue();
        }

        return sum;
    }

    public static double sumOFAll(List<? extends Number> nums){
        double sum = 0.0;
        for(Number n: nums){
            sum+=n.doubleValue();
        }

        return sum;
    }
}
