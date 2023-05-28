
//쓰레드에 우선순위를 부여하여도 100% 먼저 실행되는걸 보장하는 것은 아님. OS의 스케줄링에 따라 달라짐 
//무조건 어떠한 쓰레드를 먼저 끝내야만 한다면 join()등을 사용해야함 
public class PriorityExample {
    public static void main(String[] args) {
        for(int i =1; i<=10; i++){
            Thread thread = new CalcThread("thread" + i);
            if(i !=10){
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            else{
                thread.setPriority(Thread.MAX_PRIORITY);
            }
       
       
            thread.start();
        }

    }
    
}
