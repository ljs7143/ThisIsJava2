public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadA_notify_ threadA = new ThreadA_notify_(sharedObject);
        ThreadB_notify_ threadB = new ThreadB_notify_(sharedObject);

        threadA.start();
        threadB.start();
    }
    
}
