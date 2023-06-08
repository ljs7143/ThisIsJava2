import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
        );   //스레드풀 생성 및 스레드 실행하는 인터페이스 생성 
        System.out.println("작업 처리 요청");


        class Task implements Runnable{
            Result result;
            Task(Result result){//외부객체를 매개변수로 받는 Task생성자
                this.result = result;
            }

            @Override
            public void run(){
                int sum =0; 
                for(int i =0; i<=10; i++){
                    sum = sum + i;
                }
                result.addValue(sum);
            }
        }
        Result result = new Result();
        Runnable task1 = new Task(result); // 작업생성
        Runnable task2 = new Task(result); // 작업생성


        Future<Result> future1 = executorService.submit(task1, result);
        Future<Result> future2 = executorService.submit(task2, result);


        try{
            result = future1.get();
            result = future2.get();
            System.out.println("[처리결과]" + result.accumValue);
            System.out.println("작업처리완료");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("[실행 예외 발생함]" + e.getMessage());
        }

        executorService.shutdown();
        
    }
}
class Result{  //처리결과를 저장하는 Result클래스(외부객체)
    int accumValue;
    synchronized void addValue(int value){
        accumValue = accumValue +value;
    }
}
