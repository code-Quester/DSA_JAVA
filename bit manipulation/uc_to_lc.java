import java.util.Scanner;

public class uc_to_lc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the character ");
        char ch = sc.next().charAt(0);
        int n = ch;
        n= n|(1<<5);
        System.out.println("character in LOWERcase is "+ (char)n);
        sc.close();
        
    }
}
