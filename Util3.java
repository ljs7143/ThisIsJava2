public class Util3 {
    public static <T extends Number> int compare(T t1, T t2){
        int v1 = t1.intValue();
        int v2 = t2.intValue();     //상위 타입의 멤버로 제한됨 

        return Double.compare(v1, v2);
    }
    
}
