package linkedlist;
public class linkedlist {
    public static class Node{
         int data;
         Node next;

         public Node(int data){
            this.data = data;
            this.next = null;
         }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node new_node = new Node(data);
        size++;
        if (head ==null) {
            head = tail =new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
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
    public void add(int index,int data){
        if (index == 0) {
            addfirst(data);
            return;
        }
        Node new_node =new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next =new_node;
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
    public int removelast(){
        if (size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head = tail =null;
            size--;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev =prev.next;
        }
        int val = tail.data;
        prev.next =null;
        tail = prev;
        size--;
        return val;
    }
    public int search(int key){
        Node temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            }
            temp =temp.next;
        }

        return -1;
    }
    public int rec_search(int key, Node temp,int index){
        if (temp==null) {
            return -1;
        }
        if (temp.data == key) {
            return index;
        }
        return rec_search(key, temp.next, index+1);

    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        head =prev;
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
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        // System.out.println(ll.removefirst());
        // System.out.println(ll.removelast());
        // ll.print();
        // ll.reverse();
        ll.print();
        // System.out.println(ll.search(6));
        // System.out.println(ll.rec_search(1,head,0));
        ll.add(2, 6);
        ll.print();
        System.out.println("The size of the linked list is "+linkedlist.size);
    }
}
 