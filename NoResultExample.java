import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class NoResultExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    
    
    System.out.println("작업처리요청");

    //작업을 생성하는 과정
    Runnable runnable = new Runnable(){

        @Override
        public void run(){
            int sum =0;
            for(int i =0; i<=10; i++){
                sum = sum + i; 

            }
            System.out.println("[처리 결과]" + sum);
        }
    };
    //submit메서드의 역할
    //1.작업제출(Runnable객체)
    //2.작업실행(스레드 풀에서 실행할 수 있도록 요청)
    //3.future객체 반환. future객체는 작업이 완료되면 결과를 확인하는 메소드 제공
    Future future = executorService.submit(runnable);
    try{
        future.get(); //작업 결과 가져오기 -->여기서는 run()메소드 결과반환 
        System.out.println("[작업처리완료]");
    }catch(Exception e ){
        System.out.println("[실행예외발생함]" + e.getMessage());
    }

    executorService.shutdown();

    //future객체를 반환함으로써 작업을 제출하고 결과를 기다리는 동안 다른 작업 수행 
        
    }
    
}