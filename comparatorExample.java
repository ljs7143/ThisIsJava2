import java.util.Iterator;
import java.util.TreeSet;



public class comparatorExample {
    public static void main(String[] args) {
    
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator()); //내림차순 정렬자를 제공하여야 함 
        treeSet.add(new Fruit("포도", 100000));
        treeSet.add(new Fruit("사과", 200000));
        treeSet.add(new Fruit("망고", 800000));

        Iterator<Fruit> iter = treeSet.iterator();
        while(iter.hasNext()){

            Fruit f = iter.next();
            System.out.println(f.name + "  , " +  f.price);
        }
        
        
    }
    
}
