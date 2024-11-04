package strings_assignment;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the strings to be checked");
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder(s2);
        int i;
        if (s1.length()==s2.length()){
            for (i = 0; i < s1.length(); i++) {
                Character ch = s1.charAt(i);
                int j = sb.indexOf(ch.toString());
                if (j==-1){
                    break;
                }
                else{
                    sb = sb.deleteCharAt(j);
                }
    
            }
            if ( i==s1.length() && sb.length()==0) {
                System.out.println("strings are anagrams");
            }
            else{
                System.out.println("not anagrams");
            }
        }
        else{
            System.out.println("not ");
        }
        sc.close();
            
    }
}
