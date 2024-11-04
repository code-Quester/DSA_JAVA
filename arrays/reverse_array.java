import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        int i,k;
        for ( i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int j = 0; j <=(arr.length-1)/2; j++) {
            int temp = arr[j];
            arr[j]= arr[n-j-1];
            arr[n-j-1]= temp;
        }
        for (k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ " ");
        } 
        sc.close();
    }
}