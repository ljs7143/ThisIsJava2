public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<Integer, String>(1,"사과");
        Pair<Integer, String> p2 = new Pair<Integer, String>(1,"사과");
        
        boolean result1 = Util2.<Integer, String>compare(p1,p2);
        if(result1 == true){
            System.out.println("논리적으로 동등한 객체");
        }
        else{
            System.out.println("동등하지 않은 객체 ");
        }




        Pair<String, String> p3 = new Pair<String, String>("user1","사과");
        Pair<String, String> p4 = new Pair<String, String>("user2","사과");
        
        boolean result2 = Util2.<String, String>compare(p3,p4);
        if(result2 == true){
            System.out.println("논리적으로 동등한 객체");
        }
        else{
            System.out.println("동등하지 않은 객체 ");
        }
    }
    
}
