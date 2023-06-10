public class Pair4<K,V> {
    private K key;
    private V value;

    public Pair4(K key, V value){ //생성자
        this.key = key;
        this.value = value;
    }

    public K getKey(){return key;}
    public V getValue(){return value;}
    
}
