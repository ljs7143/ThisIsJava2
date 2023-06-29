import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();
        treeSet.add(new Person("홍길동", 23));
        treeSet.add(new Person("김자바", 1));
        treeSet.add(new Person("바카스", 14));
        
  
        Iterator<Person> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.name + " : " + person.age);
        }
        
    }
}
