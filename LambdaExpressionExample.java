import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {

    public static void main(String[] args) {
        List<StreamStudent> list = Arrays.asList(new StreamStudent("홍길동", 90), new StreamStudent("신용권", 92)
        );
        
    
        Stream<StreamStudent> stream = list.stream();
        stream.forEach(s-> {
            String name = s.getName();
            int score = s.getScore();

            System.out.println(name + " - " + score);

        });
          
     
    }
}
