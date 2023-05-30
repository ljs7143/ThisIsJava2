public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try{Thread.sleep(1000);}
        catch(InterruptedException e){

        }
        thread.interrupt();

         //실행중지가 1밀리초당 한번씩 1초동안 출력되다가 interrupt로 try문이 중지되고
         //자원 정리, 실행종료가 마지막으로 출력됨 
         
    }   
}
