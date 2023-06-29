import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapExample2 {
    public static void main(String[] args) {
         TreeMap<Integer, String> scores = new TreeMap<Integer, String>();


        scores.put(87, "이준서");
        scores.put(88, "성창미");
        scores.put(89, "이호승");
        scores.put(90, "이희경");

        NavigableMap<Integer, String > desc = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descEntrySet = desc.entrySet(); //내림차순 정렬 


        for(Map.Entry<Integer, String> entry : descEntrySet){ 
            System.out.println("내림차순 정렬 : " + entry.getKey() + " " + entry.getValue());
        }


        NavigableMap<Integer, String > asc = desc.descendingMap();
        Set<Map.Entry<Integer, String>> ascEntrySet = asc.entrySet();

        for(Map.Entry<Integer, String> entry : ascEntrySet){ 
            System.out.println("오름차순 정렬 : " + entry.getKey() + " " + entry.getValue());
        }
    }
    
}
