package stacks;
import java.util.Stack;

public class stack_ll_2 {
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data= data;
    //         this.next=null;
    //     }
    // }
    // static class Stack {
    //     static Node head = null;
    //     public boolean isEmpty(){
    //         return head==null;
    //     }

    //     public void push(int data){
    //         Node new_node = new Node(data);
    //         if (isEmpty()){
    //             head = new_node;
    //             return;
    //         }
    //         new_node.next = head;
    //         head = new_node;
    //     }
    //     public int pop(){
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         int top = head.data;
    //         head= head.next;
    //         return top;
    //     }

    //     public int peek(){
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) { 
            s.push(data);
            return;
        }
        int d = s.pop();
        pushAtBottom(s,data);
        s.push(d);
    }
    public static void main(String[] args) {
        // Stack s = new Stack();
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        pushAtBottom(s,5);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
