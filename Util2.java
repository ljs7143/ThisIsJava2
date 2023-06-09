public class Util2 {
    public static <K, V> boolean compare(Pair<K,V> p1, Pair<K, V> p2){
        boolean keyCompare = p1.getKey().equals(p2.getKey()) ;  //p1과 p2의 key 비교
        boolean valueCompare = p1.getValue().equals(p2.getValue());  //p1과 p2 의 value 비교 
        return keyCompare && valueCompare;  //둘다 true여야 true 리턴 

    }
    
}
