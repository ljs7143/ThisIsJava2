public class ThreadNameExample {


    //ThreadA와 B는 각각 독립적으로 실행됨
    //어떤게 먼저 실행될지 모름. --> A를 먼저 호출하였어도 B가 먼저 실행될 수도 있음. OS 스케줄링 기법에 의해 관리. 순서를 제어하지 않았기 때문임. 
    //위의 경우에는 동시성이 보장된 사례. 단 진짜 동시에 실행되는 것이 아닌 시분할 형식으로 여러 쓰레드가 번갈아며가며 실행됨 
    // 멀티 작업을 위해 하나의 코어에서 멀티 스레드가 번갈아가며 실행하는 성질
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름 :" + mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름 :" + threadA.getName());
        threadA.start();



        ThreadB threadB = new ThreadB();
        System.out.println("작업 스레드 이름 : " + threadB.getName());
        threadB.start();
    }
}
