import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> st = new Stack<Coin>();
        st.push(new Coin(1));
        st.push(new Coin(2));
        st.push(new Coin(3));
        st.push(new Coin(4));
        st.push(new Coin(5));

        
        while(!st.isEmpty()){
            Coin c = st.pop();
            System.out.println(c.getValue());
        }
    
    }
    
}
