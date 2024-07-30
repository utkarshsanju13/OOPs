package Generic.RawAndGenericType.Triplet;

import Generic.RawAndGenericType.Box;

public class Main {

    public static void main(String[] args) {
        OrderedTriplet<Integer,String,String> orderedPair = new OrderedTriplet<>(1,"Hello","olleH");
        OrderedTriplet<Integer,String,String> orderedPair1 = new OrderedTriplet<>(2,"Hey","yeH");
//        OrderedPair<Integer,String> orderedPair2 = new OrderedPair<>("jai","Hello"); //its shows compile time error
            //But if we use Object instead of T (Generic) we didn't get nay compile time error ,
        // it shows runtime error
//        Box<Integer> box = new Box<>(1);
//        Box b = new Box(1);
//        OrderedTriplet<String, Box<Integer>,String> p = new OrderedTriplet<>("primes", box); //Paramaterized type

//            Box<Integer> bi;
//            bi = createBox();

        System.out.println(orderedPair1);
    }
    static Box createBox(){
        return new Box(1);
    }

}
