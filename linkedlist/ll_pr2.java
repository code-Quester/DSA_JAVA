package linkedlist;
public class ll_pr2 {
    
    /**
     * Node
     */
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
    public static void print(Node head){
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
    public boolean check_palindrome(){
        if (head ==null || head.next == null) {
            return true;
        }
        Node head1 = head;
        Node head2 = tail;
        while (head2 !=null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 =head1.next;
            head2 =head2.next;
        }
        return true;
    }

    public static boolean iscycle(Node head){
        Node slow =head,fast =head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void remove_cycle(Node head){
        Node slow = head;
        Node fast = head;
        Node prev =null;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            prev =fast;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                if (fast == head) {
                    prev.next.next = null;
                    return;
                }
                while (slow != fast) {
                    slow =slow.next;
                    prev = fast;
                    fast =fast.next;
                }
                prev.next =null;
                System.out.println("ll_pr2.remove_cycle()");
            }
        }
    }
    public static void main(String[] args) {
        ll_pr2 ll = new ll_pr2();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(1);
        // System.out.println(ll.iscycle(head));
        ll.print();
        // ll.reverse_2ndhalf(ll.find_mid(head));
        // System.out.println(ll.check_palindrome());
        // ll.print();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        remove_cycle(head);
        print(head);

    }
}
