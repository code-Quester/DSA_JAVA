package stacks;
import java.util.Stack;

public class stack_rev_1 {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int d = s.pop();
        pushAtBottom(s, data);  
        s.push(d);
    }
    public static void revStack(Stack<Integer> s1){
        if (s1.isEmpty()) {
            return;
        }
        int top = s1.pop();
        revStack(s1);
        pushAtBottom(s1, top);
        return;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        revStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
