package queues;
public class queue_ll {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
           this.data = data;
           this.next = null;
        }
   }
    static class Queue {
        static Node head = null;
        static Node tail = null;
        public boolean isEmpty(){
            return head == null && tail == null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public int remove(){
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }
            int data = head.data;
            if (head == tail) {
                head = tail = null;
                return data;
            }
            head = head.next;
            return data;
        }
        public int peek(){
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
