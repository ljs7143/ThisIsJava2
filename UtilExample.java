public class UtilExample {
    public static void main(String[] args) {
        Pair4<String, Integer> pair = new Pair4<String,Integer>("홍길동", 34);
        Integer age = Util4.getValue(pair, "홍길동");
        System.out.println(age);


        ChildPair<String, Integer> childPair = new ChildPair<String,Integer>("홍삼원", 20);

        Integer childAge = Util4.getValue(childPair, "홍삼순");

        System.out.println(childAge);


    }
    
}
