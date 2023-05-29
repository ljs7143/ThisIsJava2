public class ThreadA_notify_ extends Thread  {
    private WorkObject workObject;

    public ThreadA_notify_(WorkObject workObject){
        this.workObject = workObject;

    }
    
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            workObject.methodA();  //methodA 10번호출
        }
    }
}
