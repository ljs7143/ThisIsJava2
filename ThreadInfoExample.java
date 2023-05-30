import java.util.Map;
import java.util.Set;

//이 코드 또한 100센트 같은 결과를 보장하지 못함 
//


public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();

        for(Thread thread : threads){
            System.out.println("Name :" + thread.getName()+ ((thread.isDaemon())?"(데몬)": "(주)"));

            System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}
//1     A
//2     B
//3     C  
//Key Value