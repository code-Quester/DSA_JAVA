package recursion;
import java.util.Scanner;

public class decoding {
    public static int ways(String s, int idx){
        if (idx==s.length()||idx==s.length()-1){
            return 1;
        }

        char ch1 = s.charAt(idx);
        char ch2 = s.charAt(idx+1);
        Integer n = Integer.valueOf(String.valueOf(ch1)+String.valueOf(ch2));
        if (n<=26){
            return ways(s,idx+1)+ways(s,idx+2);
        }
        else{
            return ways(s,idx+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n;
        System.out.println("Enter the number");
        n= sc.nextInt();
        String s = n.toString();
        System.out.println(ways(s,0));
        sc.close();
    } 
}
