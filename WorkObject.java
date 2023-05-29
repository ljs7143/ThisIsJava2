public class WorkObject {
    public synchronized void methodA(){
        System.out.println("ThreadA의 methodA()작업 실행 ");
        notify(); //일시정지 상태의 ThreadB를 실행대기상태로
        try{
            wait();
        } catch(InterruptedException e){

        }
    }

    public synchronized void methodB(){
        System.out.println("ThreadB의 methodB()작업 실행 ");
        notify(); //일시정지 상태의 ThreadA를 실행대기상태로
        try{
            wait();
        } catch(InterruptedException e){

        }

    }
    
}
