public class User1 extends Thread {
    private Calculator calculator;  //Calculator 클래스의 인스턴스를 저장할 수 있는 변수
    
    public void setCalculator(Calculator calculator){
        this.setName("User1");
        this.calculator = calculator;
    }

    public void run(){
        calculator.setMemory(100);
    }
    
}
