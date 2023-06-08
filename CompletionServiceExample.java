import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample extends Thread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()); //고정 크기의 스레드풀 생성 
   
   
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService); //작업의 결과를 순서대로 만들 수 있도록 함 

        System.out.println("[작업 처리 요청]");
        for(int i =0; i<3; i++){ 
            //CompleteionService를 사용하여 작업 제출
            //Callable인터페이스는 작업을 수행하고 결과를 반환 
            completionService.submit(new Callable<Integer>() {
                //submit 메서드는 제출한 작업을 스레드 풀에 할당하고 Future객체 반환 
               @Override
               public Integer call() throws Exception{
                
                int sum = 0;
                for(int i =0; i<=10; i++){
                    sum += i;
                }
                return sum;
               }
                
            });
        }


        System.out.println("[처리 완료된 작업 확인]");
        executorService.submit(new Runnable() {
            @Override
            public void run(){
                while(true){//while문을 통해 take메소드를 호출하여 작업의 완료를 기다림
                    try{
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("처리결과 :" + value);
                    }catch(Exception e){
                        break;
                    }
                }
            } 
        });

        try{Thread.sleep(3000);}
        catch(InterruptedException e){}
        executorService.shutdownNow();
    }


    
}
