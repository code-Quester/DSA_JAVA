package stacks;
import java.util.*;

public class Stack_palindrome_ll {
    public static void checkPalindrome(LinkedList<Integer> ll){
        Stack<Integer> s =new Stack<>();
        for (int i = 0; i < ll.size(); i++) {
            s.push(ll.get(i));
        }
        int i=0;
        while (i<ll.size()) {
            if (s.pop()!= ll.get(i)) {
                System.out.println("not palindrome ");
                return;
            }
            i++;
        }
        System.out.println("Palindrome");
        return;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(1);
        ll.addFirst(1);
        checkPalindrome(ll);
        
    }
}
