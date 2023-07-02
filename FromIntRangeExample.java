import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    //숫자 범위로부터 스트림 얻기
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);  //rangeClosed 해야 마지막 숫자도 inclusive됨 
        stream.forEach(a -> sum = sum+a);
        System.out.println("총합 : " + sum);
    }
}
