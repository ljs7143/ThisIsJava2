public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread(); //쓰레드생성
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());  //쓰레드생성
        thread2.start();
    }
    
}
