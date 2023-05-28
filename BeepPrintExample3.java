public class BeepPrintExample3 {
    public static void main(String[] args) {
        Thread thread = new BeepThread(); //쓰레드 객체 생성
        thread.start();  //run메소드 실행 

        for(int i = 0; i<5; i++){
            System.out.println("띵");
            try{Thread.sleep(500);}  //for문의 명령을 sleep시키는데에 국한됨
            catch(Exception e){}

        }
    }
}
