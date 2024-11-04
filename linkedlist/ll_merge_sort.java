package linkedlist;
// import java .util.*;
public class ll_merge_sort {
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
        Node fast = head.next;
        while (fast !=null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node merge(Node lefthead, Node righthead){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (lefthead !=null && righthead !=null) {
            if (lefthead.data <= righthead.data) {
                temp.next = lefthead;
                lefthead= lefthead.next;
                temp = temp.next;
            }
            else{
                temp.next = righthead;
                righthead = righthead.next;
                temp = temp.next;
            }
        }
        while (lefthead != null) {
            temp.next = lefthead;
            lefthead= lefthead.next;
            temp = temp.next;
        }
        while (righthead != null) {
            temp.next = righthead;
            righthead = righthead.next;
            temp = temp.next;
        }
        return mergedll.next;
    }
    public Node merge_sort(Node head){
        if ( head.next == null) {
            return head;
        }
        Node mid = find_mid(head);
        Node righthead = mid.next;
        mid.next =null;
        Node left = merge_sort(head);
        Node right = merge_sort(righthead);
        return merge(left,right);
    }
    public static void main(String[] args) {
        // LinkedList<Integer> ll  = new LinkedList<>();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addFirst(3);
        // System.out.println(ll);
        // ll.removeFirst();
        // System.out.println(ll);

        ll_merge_sort ll = new ll_merge_sort();
        ll.addlast(5);
        ll.addlast(2);
        ll.addlast(1);
        ll.addlast(8);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();
        head = ll.merge_sort(head);
        ll.print();

    }
}
