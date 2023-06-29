import java.io.OutputStream;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("as", 4);
        treeMap.put("asbbg", 4);
        treeMap.put("cgg", 6);
        treeMap.put("zoo", 2);
        treeMap.put("f", 3);
        treeMap.put("guess", 5);

        System.out.println("c~f 사이 단어 검색 ");
        NavigableMap<String,Integer> map = treeMap.subMap("c", true, "f", true);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue() + " 페이지 ");         
        }        
    }
}
