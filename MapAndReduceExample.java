import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<sstudent> list = Arrays.asList(
            new sstudent("홍길동", 10),
            new sstudent("신용권", 11),
            new sstudent("유미선", 23)
        );


        double avg = list.stream().mapToInt(sstudent :: getScore).average().getAsDouble();
        //중간처리(학생객체를 점수로 매핑) -> 최종 처리(평균내기)
        System.out.println("평균 점수 : " + avg );

        
    }
    
}
