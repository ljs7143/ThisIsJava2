public class BoxExample {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.set("홍길동"); //String -> Object 자동 타입 변환
        String name = box.get(); //강제타입변환

        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        int value = box2.get();
    }
    
}
