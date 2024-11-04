package stacks;
import java.util.*;

public class stack_duplicate_parenthesis {
    public static boolean dp(String str){
        Stack<Character> s = new Stack<>();
        HashMap<Character,Character> map =new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsValue(ch)) {
                s.push(ch);
            }else if (map.containsKey(ch)) {
                if (s.isEmpty()) {
                    System.out.println("invalid");
                    return false;
                }
                int j=0;
                while (s.isEmpty() || s.peek() != map.get(ch)) {
                    if (s.isEmpty()) {
                        System.out.println("invalidd");
                        return false;
                    }  
                    if (map.containsValue(s.peek()) && s.peek() != map.get(ch)) {
                        System.out.println("invaliddd");
                        return false;
                    }
                    s.pop();
                    j++;            
                }
                if (j==0) {
                    return true;
                }
                s.pop(); 
            }else{
                s.push(ch);
            }
        }
        if(s.isEmpty()){
            return false;
        }
        else{
            System.out.println("invalidddd");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.nextLine();
        System.out.println(dp(s));
        sc.close();
    }
}
