public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    
    
        User1 user1 = new User1(); //User1 쓰레드 생성
        user1.setCalculator(calculator);
        user1.start();                         //user1.start()를 먼저 호출했다고 해서, 먼저 이 쓰레드가 시작되는 것이 아님
                                              // user2와 user1는 동시에 시작됨. 순서 장담X. 운영체제의 스케줄링에 따라 결정

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }

    //user1호출->memory 100저장-> 2초간 정지 -> 그 사이에 user2실행 -> 메모리50저장 -> 쓰레드 정지 -> user1쓰레드의 현재 메모리값 출력 -> user2 쓰레드의 현재 메모리 값 출력 -> 둘다 50 나옴

    //그러나 OS와 스케줄링에 의헤 100이 나올 수도 있음. 
    
}
