package stacks;
import java.util.Stack;

public class stack_rev {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str ="Suchi";
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }

    }
}
