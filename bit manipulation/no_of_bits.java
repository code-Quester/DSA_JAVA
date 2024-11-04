import java.util.Scanner;

public class no_of_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int bitmask = 1;
        int c=0;
        while (n!=0) {
           if ((n & bitmask) == 1) {
                c++;
           } 
           n=n>>1;
        }
        System.out.println("number of set bits "+ c);
        sc.close();
    }
}
