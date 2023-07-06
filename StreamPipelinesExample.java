import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member16> list = Arrays.asList(
            new Member16("홍길동", Member16.MALE, 30),
            new Member16("김나리", Member16.FEMALE, 20),
            new Member16("신용권", Member16.MALE, 45),
            new Member16("박수미", Member16.FEMALE, 27)
            
        );

        //list컬렉션을 스트림으로 변환. 스트림의 요소 중 남자만 필터링. 나이 정보로 매핑. int값으로. 평균 double형으로 반환 
        double ageAvg = list.stream().filter(m-> m.getSex() == Member16.MALE).mapToInt(Member16 :: getAge).average().getAsDouble();
        System.out.println("남자 평균 나이 :  " + ageAvg);
    }
    
}
