import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;


public class IteratorVsStreamExample {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("홍길동", "신용권","김자바");
       //iterator 사용방식
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }



        System.out.println();

        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name) );

    }
    
}
