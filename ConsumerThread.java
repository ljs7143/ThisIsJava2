public class ConsumerThread extends Thread{
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox){

        this.dataBox = dataBox;
    }

    public void run(){
        for(int i=1; i<=3; i++){
            String Data = dataBox.getData();
        }
    }
}
