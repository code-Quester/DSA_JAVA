import java.util.Scanner;

public class subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n]; 

        System.out.println("Enter the elements");
        for ( int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int k =0;
        while (k<arr.length) {
            for (int j = k; j < arr.length; j++) {
                System.out.print("(");
                for (int t = k; t <= j; t++) {
                    System.out.print(arr[t]);
                    
                }
                System.out.print(")");
            }
            System.out.println();
            k++;
        }

        sc.close();
    }
}
