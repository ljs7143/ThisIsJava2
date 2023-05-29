public class YieldExample {
    public static void main(String[] args) {
        ThreadA_yield_ threadA = new ThreadA_yield_();
        ThreadB_yield_ threadB = new ThreadB_yield_();

        threadA.start();
        threadB.start();

        try{Thread.sleep(3000);} catch (InterruptedException e){}
        threadA.work = false;

        try{Thread.sleep(3000);} catch (InterruptedException e){}
        threadA.work = true;

        try{Thread.sleep(3000);} catch (InterruptedException e){}
        threadA.stop = true;
        threadB.stop = true;

    }
    
}
