public class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(){
        this.sum = sum;
    }

    public void run(){
        for(int i =1; i<=100; i++){
            sum = sum+i;
        }
    }
    
}
