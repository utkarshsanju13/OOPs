package Generic.RawAndGenericType.OrderedPair;

import Generic.RawAndGenericType.Box;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        OrderedPair<Integer,String> orderedPair = new OrderedPair<>(1,"Hello");
        OrderedPair<Integer,String> orderedPair1 = new OrderedPair<>(2,"Hey");
//        OrderedPair<Integer,String> orderedPair2 = new OrderedPair<>("jai","Hello"); //its shows compile time error
            //But if we use Object instead of T (Generic) we didn't get any compile time error ,
        // it shows runtime error
        Box<Integer> box = new Box<>(1);
        Box b = new Box(1);
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", box); //Paramaterized type

            Box<Integer> bi;
            bi = createBox();
    }
    static Box createBox(){
        return new Box(1);
    }

}
