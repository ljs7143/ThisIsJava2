import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//복습 요함 
public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("이준서", 23);
        map.put("엄마", 57);
        map.put("아빠", 58);
        Set<String> set1 = map.keySet(); //map의 key값들을 set으로 반환 
        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            int value = map.get(key);
            System.out.println("키값 : " + key  + "값 : " +  value);
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iter2 = entrySet.iterator();
        while(iter2.hasNext()){
            Map.Entry<String, Integer> entry = iter2.next();
            String key =entry.getKey();
            int value = entry.getValue();
            System.out.println("키값 : " + key  + "값 : " +  value);
        }
    }
}
// //키값 : 아빠값 : 58
// 키값 : 이준서값 : 23
// 키값 : 엄마값 : 57   순서 보장 안됨 
