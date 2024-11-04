package stacks;
import java.util.*;
public class stack_ll {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int data){
        stack.addFirst(data);
    }
    public void pop(){
        stack.removeFirst();
    }
    public int peek(){
        return stack.getFirst();
    }
    public void pushLast(int data){
        stack.addLast(data);
    }
    public static void main(String[] args) {
        stack_ll stack = new stack_ll();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pushLast(4);
        stack.pushLast(5);
        while (!stack.stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
        
        
    }
}
