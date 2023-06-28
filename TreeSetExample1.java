import java.util.NavigableSet;
import java.util.TreeSet;
public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);


        Integer score = null;

        System.out.println(scores.first());  //제일 낮은 객체 리턴
        System.out.println(scores.last());   //제일 높은 객체를 리턴 

        System.out.println(scores.lower(98)); //바로 다음으로 낮은거 리턴
        System.out.println(scores.higher(87)); //바로 다음으로 높은거 리턴 



        NavigableSet<Integer> des = scores.descendingSet();  //Treeset을 내림차순 정렬 
        for(Integer sc : des){
            System.out.print(sc + " ");
        }

        System.out.println();

        NavigableSet<Integer> asc = scores.descendingSet().descendingSet(); //descendingSet()을 두번하면 ascending이된다 .
        for(Integer sc : asc){
            System.out.print(sc+ " ");
        }


    }
    
}
