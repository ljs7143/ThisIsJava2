import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
            "홍길동", "신용권", "김자바",
            "람다식", "박병렬"
        );

        Stream<String> stream = list.stream();
        stream.forEach(ParalleExample :: print);

        System.out.println();


        Stream<String> paralleStream = list.parallelStream();
        paralleStream.forEach(ParalleExample :: print);


        
    }

    public static void print(String s){
        System.out.println(s + " : " + Thread.currentThread().getName());
    }
    
}
//결과   -> 스트림 병렬처리로 인해 멄티스레딩이 지원되어 여러 스레드가 작동하여 출력되었기 떄문. 하지만 스레드의 작동 순서 및 어떤 스레드가 관여하는지는 스케줄링, JVM에 의해 결정됨 
// 김자바 : main
// 박병렬 : main
// 람다식 : main
// 홍길동 : ForkJoinPool.commonPool-worker-2
// 신용권 : ForkJoinPool.commonPool-worker-1



