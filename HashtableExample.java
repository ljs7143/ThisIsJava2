import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class HashtableExample {
    public static void main(String[] args) {
        Map<String, String> ht = new Hashtable<String, String>();
        ht.put("이준서","12345");
        ht.put("lee", "12345");


        Scanner sc = new Scanner(System.in);

        System.out.println("아이디와 비밀번호를 입력하세요");
        System.out.print("ID");
        String ID = sc.nextLine();
        System.out.print("password");
        String password = sc.nextLine();
        System.out.println();

        if(ht.containsKey(ID)){
            if(ht.get(ID).equals(password)){
                System.out.println("로그인 되었습니다");
            
            }else{
                System.out.println("비밀번호가 일치하지 않습니다");
            }
        }else{
            System.out.println("아이디가 존재하지 않습니다");
        }
        
    }
    
}
