import java.util.Scanner;

public class pairs_array {
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
        while (k<arr.length-1) {
            for (int i = k+1; i < arr.length; i++) {
                System.out.print("("+arr[k]+","+arr[i]+")");
            }
            k++;
            System.out.println();
        }

        sc.close();
    }
}
