package stacks;
import java.util.*;
public class stack_al {
    static class Stack {
    
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if (Stack.isEmpty()) {
                System.out.println("the stack is empty ");
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            if (Stack.isEmpty()) {
                System.out.println("the stack is empty ");
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!Stack.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}