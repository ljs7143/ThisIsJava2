
//타겟 스레드의 상태를 출력하는 스레드
public class StatePrintThread extends Thread {
    private Thread targetThread;


    //targetThread가 상태를 조사할 쓰레드 
    public StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }
    
    public void run() {
        while(true){
            Thread.State state =targetThread.getState(); //target스레드의 상태를 얻음 
            System.out.println("타겟 스레드 상태 :" + state);
        
            if(state == Thread.State.NEW){
                targetThread.start(); //스레드가 생성 상태일 때, Runnable상태로 만듦
            }

            if(state == Thread.State.TERMINATED){
                break;
            }
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        
        
        }
    }
}
