import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<String>();
        List<String> list2 = new ArrayList<String>();

        long startTime;
        long endTIme;

        startTime = System.nanoTime();

        for(int i =0; i<10000; i++){
            list1.add(0, String.valueOf(i));

        }

        endTIme = System.nanoTime();
        System.out.println("LinkedList 시간 " + (endTIme-startTime));
        


        startTime = System.nanoTime();

        for(int i =0; i<10000; i++){
            list2.add(0, String.valueOf(i));

        }

        endTIme = System.nanoTime();
        System.out.println("ArrayList 시간 " + (endTIme-startTime));
        
    }
    
}
//LinkedList 시간 3102911
// ArrayList 시간 6094682  2배차이남 