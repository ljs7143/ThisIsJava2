import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 95);
    

        System.out.println(map.size());



        Set<Student> set = map.keySet();

        Iterator<Student> iter = set.iterator();

        while(iter.hasNext()){
            Student key = iter.next();
            int score = map.get(key);

            System.out.println("학생 : " + key + "점수 : " + score );
        }

    }
    
}
