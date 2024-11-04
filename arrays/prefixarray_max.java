import java.util.Scanner;

public class prefixarray_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        int prefix_arr[]=new int[n];
        System.out.println("Enter the elements");
        for ( int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        prefix_arr[0]= arr[0];
        for (int i = 1; i < prefix_arr.length; i++) {
            prefix_arr[i]= prefix_arr[i-1]+arr[i];
        }
        int max_sum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = i ==0 ? prefix_arr[j]:prefix_arr[j]-prefix_arr[i-1];
                System.out.println(sum);
                if (max_sum<sum){
                    max_sum=sum;
                }
            }
        }
        System.out.println("the maximum sum is "+ max_sum);
        sc.close();
    }
}
