public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> c1 = new Container<String, String>();
        c1.set("이준서", "스물셋");
        String answer1 = c1.getKey();
        String answer2 = c1.getValue();
        System.out.println(answer1);
        System.out.println(answer2);

        Container<Integer, Integer> c2 = new Container<Integer, Integer>();
        c2.set(23,23);
        int answrNum = c2.getKey();
        int answrNum2 = c2.getValue();
        System.out.println(answrNum);
        System.out.println(answrNum2);
    }
    
}
