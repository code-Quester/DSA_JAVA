package patterns;
import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        // int m;int n;
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter");
        // m=sc.nextInt();
        // n=sc.nextInt();
        // for(int i =1;i<=m;i++){
        //     for(int j = 1;j<=n;j++){
        //         if(i==1||i==m){
        //             System.out.print("* ");
        //         }
        //         else if(j==1||j==n){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // System.out.println("enter");
        // m=sc.nextInt();
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=m;j++){
        //         if (j<=m-i) {
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println("enter");
        // m=sc.nextInt();
        // int c=1;
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         if ((i+j)%2==0){
        //             System.out.print(1 +" ");
        //         }
        //         else{
        //             System.out.print(0 +" ");
                    
        //         }

        //     }
        //     System.out.println();
        // }
        
        // int i,j;
        // for (i = 1; i <= n; i++) {
        //     // inner loop to print the spaces
        //     for (j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print(" ");
        //     }

        //     // inner loop to print the first part
        //     for (j = i; j >= 1; j--) {
        //         System.out.print(j + " ");
        //     }

        //     // inner loop to print the second part
        //     for (j = 2; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }

        //     // printing new line for each row
        //     System.out.println();
        // for (int i = 1; i <=n*2-1; i++) {
        //     if(i<=n){
        //         for (int j = 1; j <= n-i; j++) {
        //             System.out.print("  ");
        //         }
        //         for (int k = 1; k <= i*2-1; k++) {
        //             if (k%2!=0){
                        
        //                 System.out.print("* ");
        //             }
        //             else{
                        
        //                 System.out.print("  ");
        //             }
        //         }

        //     }
        //     else{
        //         for (int j = 1; j <= i-n; j++) {
        //             System.out.print("  ");
        //         }
        //         for (int k = 1; k <= (n*2-i)*2-1; k++) {
        //             if (k%2!=0){
                        
        //                 System.out.print("* ");
        //             }
        //             else{
                        
        //                 System.out.print("  ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }
        System.out.println("enter");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = n+1; j <=n*2-i; j++) {
                System.out.print("  ");
                
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = n+1; j <=n*2-i; j++) {
                System.out.print("  ");
                
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

