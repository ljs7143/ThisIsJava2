import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();
        
        set.add(new Member("이준서 ", 23));
        set.add(new Member("이준서 ", 23));

        System.out.println(set.size());
//중복X
    }
    
}
