package recursion;
import java.util.*;
public class binary_strings {

    public static boolean check(String str,int idx){
        if (idx==str.length()){
            return true;
        }
        char ch = str.charAt(idx);
        if (ch!='0'&& ch!='1'){
            return false;
        }
        else if(ch=='1'){
            if (idx<str.length()-1 && ch == str.charAt(idx+1)){
                return false;
            }
        }

        return check(str, idx+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary string ");
        String str = sc.nextLine();

        if (check(str,0)== true){
            System.out.println("ok");
        }
        else{
            System.out.println("not ok");
        }
    }
}
