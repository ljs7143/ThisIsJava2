
//이 것이 공유객체임 


public class Calculator {

    private int memory;
    public int getMemory(){
        return memory;
    }

    public synchronized void setMemory(int memory){  //user1쓰레드의 이 메소드가 실행될 떄 user2쓰레드는 이 메소드를 사용할 수 없음. 그래서 user1:100먼저 출력 후 2초 뒤 user2:50이 출력됨 
        this.memory = memory;
        try{
            Thread.sleep(2000);  //2초간

        }catch(InterruptedException e){}
        System.out.println(Thread.currentThread().getName() +": " + this.memory);
    }
}
