public class ThreadExample_ten_ {
    public static void main(String[] args) {
        Thread thread = new MovieThread_ten_();

        thread.setDaemon(true); //main스레드 종료되면 같이 종료
        thread.start();

    }
    
}
