import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");

        set.add("4");
        set.add("3");
        set.add("1");
        set.add("6");
        set.add("1");
        set.add("56");
        set.add("5");
        set.add("8");

        Iterator<String> s1 = set.iterator();

        while(s1.hasNext()){
            String el = s1.next();
            System.out.println(el);
        }
    }
    
}
//1
// 56
// 2
// 3
// 4
// 5
// 6
// 8 결과임. 중복저장X. 순서보장 X
