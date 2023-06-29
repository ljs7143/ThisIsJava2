import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; //최고 점수를 받은 아이디 저장
        int MaxScore = 0; //최고점수 저장
        int totalScore = 0; //점수 합계 저장


        Set<String> keySet = map.keySet();
        for(String k : keySet){
            totalScore = totalScore + map.get(k);
            if(map.get(k)>MaxScore){
                MaxScore =map.get(k);
                name = k;
            }
        }
        System.out.println("최고점수 : " + MaxScore);
        System.out.println("최고점수 ID : " + name);
        System.out.println("점수합계  : " + totalScore);
    }
    
}
