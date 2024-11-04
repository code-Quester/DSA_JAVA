package linkedlist;
public class ll_pr1 {

    /**
     * node
     */
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addlast(int data){
        Node new_node = new Node(data);
        size++;
        if (head==null) {
            head = tail =new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;

    }
    public void print(){
        if (head==null) {
            System.out.println("the linked list is empty");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void delete_nth_node(int n){
        //size calculation
        int sz=0;
        Node temp =head;
        while (temp!=null) {
            temp = temp.next;
            sz++;
        }

        if (n==sz) {
            head =head.next; //remove first node
            return;
        }
        
        Node prev =head;
        for (int i = 0; i < sz-n-1; i++) {
            prev =prev.next;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        ll_pr1 ll = new ll_pr1();

        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        ll.delete_nth_node(3);
        ll.print();
    }
}
