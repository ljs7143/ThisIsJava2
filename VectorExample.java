import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();
        list.add(new Board("제목", "내용", "작가"));

        System.out.println(list.get(0).writer);

    }
    
}
