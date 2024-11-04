public class revisionLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head =tail=newNode;
            return;
        }
        newNode.next = head;
        head= newNode;
        return;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head =tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        return;
    }
    public void add(int idx,int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head =tail=newNode;
            return;
        }
        Node temp = head;
        for(int i=0;i<idx-1;i++){
            temp= temp.next;
        }
        newNode.next= temp.next;
        temp.next = newNode;
        return;
    }
    public int removefirst(){
        if (size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head = tail =null;
            size--;
            return val;
        }
        int val = head.data;
        head =head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size== 1){
            int val= head.data;
            head= tail= null;
            size--;
            return val;
        }
        Node temp = head;
        for(int i = 0 ; i< size-2;i++){
            temp =temp.next;
        }
        int val = tail.data;
        temp.next= null;
        tail = temp;
        size--;
        return val;
    }
    public int rec_search(Node temp , int key,int idx){
        if (temp==null) {
            return -1;
        }
        if(temp.data == key){
            return idx;
        }
        return rec_search(temp.next, key, idx+1);
    }
    public void print(){
        if (head==null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp= head;
        for(int i =0;i<size;i++){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        revisionLL ll = new revisionLL();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();

    }
}
