package Generic.RawAndGenericType.OrderedPair;

public class Util {

    public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {

        Pair<Integer,String> p1 = new OrderedPair<>(1,"Hello");
        Pair<Integer,String> p2 = new OrderedPair<>(1,"Hello");

//        boolean result = Util.<Integer,String>compare(p1,p2);
//              The complete syntax for invoking this method would be
        boolean result = Util.compare(p1,p2);
        System.out.println(result);
//        Number n =
    }
}
