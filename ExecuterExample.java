import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuterExample {
    public static void main(String[] args) throws Exception {


        ExecutorService executorService = Executors.newFixedThreadPool(2); //최대 스레드 개수가 2인 스레드풀 생성 

        for(int i =0; i<10; i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run(){
                    //스레드 총 개수 및 작업 스레드 이름 출력 
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름 : " + threadName);

                    int value = Integer.parseInt("삼");
                }
            };

            // executorService.execute(runnable);
            executorService.submit(runnable);

            Thread.sleep(10);
        }
        executorService.shutdown();
    }
}

//스레드풀의 동작방식으로 인해 실행 중일때와 실행대기 중일떄로 번갈아감
// 그래서 결과값이 총 스레드 개수: 2] 작업 스레드 이름 : pool-1-thread-2
// [총 스레드 개수: 1] 작업 스레드 이름 : pool-1-thread-1 이렇게 번갈아가면서 출력됨 









