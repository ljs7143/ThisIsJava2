import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("이준서","이준서1");

        for(String i: list){
            System.out.println(i);
        }

        List<Integer> list2=  Arrays.asList(1,2,3);

        for(int K : list2){
            System.out.println(K);
        }
    }
}