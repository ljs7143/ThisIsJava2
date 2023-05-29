public class ThreadB_notify_ extends Thread {
    private WorkObject workObject;

    public ThreadB_notify_(WorkObject workObject){
        this.workObject = workObject;

    }
    
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            workObject.methodB();  //methodB 10번호출
        }
    }
}
