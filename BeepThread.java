import java.awt.Toolkit;

public class BeepThread extends Thread {

    @Override
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i<5; i++){
            toolkit.beep();
            try{Thread.sleep(500);}     //try-catch문을 통해 이 쓰레드가 예쌍치 못하게 작업이 종료되어도 다른 쓰레드는 영향을 받지 않고 실행할 수 있도록함 

            catch(Exception e ) { }
        }
    }
}
