public class tenStudent implements Comparable<tenStudent>{

    public String id;
    public int score;
    
    public tenStudent(String id, int score){
        this.id = id;
        this.score =score;
    }
    @Override

    public int compareTo(tenStudent o){
        if(o instanceof tenStudent){
            tenStudent ts  = (tenStudent) o;
            if(score<ts.score){
                return -1;
            }else if(score==ts.score){
                return 0;
            }else{
                return 1;
            }
        }else{
            return -1;
        }
    }
}
    
