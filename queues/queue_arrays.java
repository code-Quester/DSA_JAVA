package queues;
/**
 * queueb
 */
public class queue_arrays {

    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        Queue(int n){
            arr= new int[n];
            size = n;
            rear = -1;
        }
        public boolean isEmpty(){
            return rear == -1;
        }
        public void add(int data){
            if (rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public int remove(){
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }
            int data = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];
            }
            rear--;
            return data;
        }
        public int peek(){
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
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