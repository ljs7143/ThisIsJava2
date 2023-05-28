

import java.awt.Toolkit;

//자바에서 Runnable을 따로 선언하지 않으면 메인쓰레드
//main문에서 진행되는 것이 메인쓰레드 


public class BeepTask implements Runnable {

    @Override
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0; i<5; i++){
            toolkit.beep();
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }   
}
