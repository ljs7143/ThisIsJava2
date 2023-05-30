public class PrintThread1 extends Thread {
    private boolean stop;
    public void setStop(boolean stop){
        this.stop = stop;
    }

    public void run(){
        while(!stop){  // 이 구문이 stop 플래그임 
            System.out.println("실행중");          //스레드가 반복 실행하는 코드 ; 
        } 
        System.out.println("자원 정리");            
        System.out.println("실행 종료");
    }
    
}
