import java.awt.*;


//비프음을 모두 발생한 다음, 프린틍을 시작함 
//두개가 동시에 진행되려면 하나를 메인스레드가 아닌 다른스레드에서 실행시켜야함 



public class BeepPrintExample1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        
        
        for(int i = 0; i<5; i++){
            toolkit.beep();
            try{ Thread.sleep(500);} catch(Exception e){}
        }
        for(int i =0; i<5; i++){
            System.out.println("띵");
            try{Thread.sleep(500);} catch(Exception e ){}
        }

    }
    
}
