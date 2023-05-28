

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();  //BeepTask 객체 생성
        Thread thread = new Thread(beepTask); //작업 쓰레드 생성
        thread.start(); //beepTask객체의 run()메소드 실행

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{Thread.sleep(500);}
            catch(Exception e ){}
        }

    }
    
}
