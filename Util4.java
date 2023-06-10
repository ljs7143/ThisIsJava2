public class Util4 {

    public static <K,V> V getValue(Pair4<K,V> p, K k){
        if(p.getKey().equals(k)){
            return p.getValue();
        }
        else{
            return null;

        }


    }
}
