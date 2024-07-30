package Generic.RawAndGenericType.OrderedPair;

public class OrderedPair<K,V> implements Pair<K,V>{

    public K key;
    public V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
