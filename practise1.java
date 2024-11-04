public class practise1 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        public boolean isEmpty(){
            return head == null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            return;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("the stack is empty ");
                return  -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("the stack is empty ");
                return  -1;
            }
            return head.data;
        }
        public void pushAtBottom(int data){
            if (isEmpty()) {
                push(data);
                return;
            }
            int val = pop();
            pushAtBottom(data);
            push(val);
        }
    }
    public static void revStack(Stack s){
        if (s.isEmpty()) {
            return;
        }
        int val = s.pop();
        revStack(s);
        s.pushAtBottom(val);
        return;
    }
    public static void main(String[] args) {
        Stack s = new Stack();
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
