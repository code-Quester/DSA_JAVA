package linkedlist;

public class ll_zigzag {
    public static class Node {
    
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =null;
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
    public Node find_mid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast !=null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void reverse_2ndhalf(Node head1){
        Node prev =null;
        Node curr = head1;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next =prev;
            prev =curr;
            curr = next;
        }
    }
    public void zigzag(Node mid){
        Node curr1 = head;
        Node curr2 = tail;
        while (curr1 != mid && curr2 != mid) {
            Node next1 =curr1.next;
            Node next2 =curr2.next;

            curr1.next =curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;
        }
    }
    public static void main(String[] args) {
        ll_zigzag ll = new ll_zigzag();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.print();
        Node mid = ll.find_mid(head);
        ll.reverse_2ndhalf(mid);
        ll.zigzag(mid);
        ll.print();
    }
}
