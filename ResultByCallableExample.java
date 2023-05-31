import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        System.out.println("작업처리요청");
        Callable<Integer> callabe = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum =0;
                for(int i =0; i<=10; i++){
                    sum = sum + i;   
                }
                return sum;
            }
        };


        Future<Integer> future = executorService.submit(callabe);

        try{
            int sum = future.get();
            System.out.println("처리결과:" + sum);
        
            System.out.println("작업처리완료");

        }catch(Exception e){
            System.out.println("실행예외가 발생함 " + e.getMessage());
        }
        executorService.shutdown();
        //shutdown사용이유
        //1.안전한 종료 -->예기치 않은 종료 방지 및 안전하게 스레드 풀 종료 가능 
        //2. 자원 누수 방지
        //3. Graceful한 종료 
    }

    
}
