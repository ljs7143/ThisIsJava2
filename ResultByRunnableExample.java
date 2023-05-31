import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ResultByRunnableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
        );   //스레드풀 생성 및 스레드 실행하는 인터페이스 생성 
        System.out.println("작업 처리 요청");


        class Task implements Runnable{
            Result result;
            Task(Result result){
                this.result = result;
            }
        }
    }
    
}
