package stacks;
import java.util.*;

public class stack_valid_parenthesis {
    public static boolean vp(String str){
        Stack<Character> s =new Stack<>();
        // HashMap<Character,Character> map = new HashMap<>();
        // map.put(')', '(');
        // map.put('}', '{');
        // map.put(']', '[');
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (map.containsValue(ch)) {
        //         s.push(ch);
        //     }else if (map.containsKey(ch) ) {
        //         if (s.isEmpty() || map.get(ch)!=s.pop()) {
        //             return false;
        //         }
        //     }
        // }
        // return s.isEmpty() ;
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if (ch=='(') {
                s.push(')');
            }
            else if (ch=='{') {
                s.push('}');
            }
            else if (ch =='[') {
                s.push(']');
            }
            else{
                if(s.isEmpty()|| ch!=s.pop()){
                    return false;
                }
                
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.nextLine();
        System.out.println(vp(s));
        sc.close();
    }
}
