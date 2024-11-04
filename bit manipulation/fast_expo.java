import java.util.Scanner;

public class fast_expo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the exponent ");
        int n = sc.nextInt();

        int ans =1;
        while (n>0) {
            if ((n&1) !=0) {
                ans *= a;
            } 
            a *= a ;
            n = n>>1;
        }
        System.out.println(ans);
        sc.close();

    }
}
