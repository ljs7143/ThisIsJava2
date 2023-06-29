import java.util.TreeSet;

public class treeSetExample {
    public static void main(String[] args) {
        TreeSet<tenStudent> tree = new TreeSet<tenStudent>();
        tree.add(new tenStudent("blue", 96));
        tree.add(new tenStudent("hong", 93));
        tree.add(new tenStudent("white", 53));

        tenStudent t = tree.last();
        System.out.println(t.score);
    
    }
    
}
