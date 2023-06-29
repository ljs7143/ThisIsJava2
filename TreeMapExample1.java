import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<Integer, String>();


        scores.put(87, "이준서");
        scores.put(88, "성창미");
        scores.put(89, "이호승");
        scores.put(90, "이희경");

        Map.Entry<Integer, String> entry = null;

        entry = scores.firstEntry(); //key값이 제일 작은 entry
        System.out.println("제일 작은 점수 " + entry.getKey() + " "  + entry.getValue() );

        entry = scores.lastEntry(); //key값이 제일 큰 entry
        System.out.println("제일 큰 점수 " + entry.getKey() + " "  + entry.getValue() );
        
        entry = scores.lowerEntry(89); //89바로 밑에 있는 값 return
        System.out.println("89아래  점수 " + entry.getKey() + " "  + entry.getValue() );

        entry = scores.higherEntry(87); //87바로 위에 있는 값 return
        System.out.println("87바로 위의 점수  " + entry.getKey() + " "  + entry.getValue() );

        entry = scores.floorEntry(87); //87이 존재하면 87 return, 아니면 바로 아래에 있는 값 return
        System.out.println(entry.getKey() + " "  + entry.getValue() );

        entry = scores.ceilingEntry(70); //70이 존재하면 70 return, 아니면 바로 위에 있는 값 return
        System.out.println("87바로 위의 점수  " + entry.getKey() + " "  + entry.getValue() ); 

        while(!scores.isEmpty()){
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + "   " + entry.getValue() + " 남은 객체 수 :  " + scores.size());
        }
    }
    
}
