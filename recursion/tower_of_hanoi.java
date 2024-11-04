package recursion;
import java.util.Scanner;

/**
 * tower_of_hanoi
 */
public class tower_of_hanoi {
    public static void toh(int n, String source,String helper,String destination){
        if (n==1) {
            System.out.println("move plate "+n+" from "+ source+" to "+ destination);
            return;
        }
        toh(n-1, source, destination, helper);
        System.out.println("move plate"+n+" from "+ source+" to "+ destination);
        toh(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of plates");
        int n = sc.nextInt();
        toh(n,"A","B","C");

    }
}