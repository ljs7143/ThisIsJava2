public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); //AutoSaveThread를 데몬 스레드로 만듦
        autoSaveThread.start();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

        System.out.println("메인 스레드 종료");
    }
}
//메인스레드가 종료되면 우리가 설정해준 autoSaveThread. 즉 데몬 스레드도 종료됨 
