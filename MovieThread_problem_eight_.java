public class MovieThread_problem_eight_ extends Thread {
    @Override
    public void run(){
        while(true){
            System.out.println("동영상을 재생합니다");
        
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            interrupt();
        }
    }
    
}
