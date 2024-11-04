package queues;
public class queue_circular {
    static class Queue {
        int rear;
        int size;
        int arr[];
        int front;
        Queue(int n){
            arr= new int[n];
            size = n;
            rear = front =-1;
        }
        public boolean isEmpty(){
            return rear == -1 && front ==-1;
        }
        public boolean isFull(){
            return (rear+1) % size == front;
        }
        public void add(int data){
            if (isFull()) {
                System.out.println("the queue is full");
                return;
            }
            //add first element
            if (front ==-1) {
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public int remove(){
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }
            int data = arr[front];
            if (rear == front) {
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return data;
        }
        public int peek(){
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
