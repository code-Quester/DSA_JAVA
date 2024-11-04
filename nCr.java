// import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // int r= sc.nextInt();
        // int p = 1;
        // for (int i = 0; i < r; i++) {
        //     p *= (n-i);
        //     p /= (i+1);
        // }
        // System.out.println(p);

        int row = 6;
        int ans=1;
        System.out.print(ans +" ");
        for (int i = 1; i < row ; i++) {
            ans = ans * (row -i);
            ans = ans / (i);
            System.out.print(ans+" ");
        }
        System.out.println();
    }

}
