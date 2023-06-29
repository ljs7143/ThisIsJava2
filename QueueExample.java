import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<Message>(); 

        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKaKaotalk", "홍길동"));


        while(!queue.isEmpty()){
            Message q = queue.poll();

            switch(q.command){
                case "sendMail" : 
                    System.out.println(q.to+"님에게 메일을 보냈습니다");
                    break;

                case "sendSMS" : 
                    System.out.println(q.to+"님에게 문자를 보냈습니다");
                    break;
                case "sendKaKaotalk" : 
                    System.out.println(q.to+"님에게 카톡을 보냈습니다");
                    break;
            }
        }
    }
    
}
