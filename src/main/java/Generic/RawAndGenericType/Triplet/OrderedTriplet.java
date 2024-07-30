package Generic.RawAndGenericType.Triplet;

public class OrderedTriplet<K,V,L> implements Triplet<K,V,L> {

    public K key;
    public V value;
    public L secondValue;

    public OrderedTriplet(K key, V value,L value2) {
        this.key = key;
        this.value = value;
        this.secondValue = value2;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public L getSecondValue() {
        return secondValue;
    }

    @Override
    public String toString() {
        return "OrderedTriplet{" +
                "key=" + key +
                ", value=" + value +
                ", secondValue=" + secondValue +
                '}';
    }
}
