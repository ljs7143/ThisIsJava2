import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();


        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("cherry");

        System.out.println("c~f 사이의 단어 검색");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);  //스프링 웹개발 시 활용 가능 
        //true면 <=  true면 =<
        for(String s : rangeSet){
            System.out.println(s);
        }

    }
    
}
