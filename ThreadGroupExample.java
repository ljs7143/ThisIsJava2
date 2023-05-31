public class ThreadGroupExample {
    
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup"); //스레드 그룹 생성. ThreadGroup은 클래스임 
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");  //스레드A,B생성. 그 두개는 같은 그룹임 
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");


        workThreadA.start();
        workThreadB.start();

        System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();  //현재 실행중인 스레드가 소속된 그룹을 반환한다
        mainGroup.list();
        System.out.println();

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){ }

        System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출]");
        myGroup.interrupt();
    }
}
