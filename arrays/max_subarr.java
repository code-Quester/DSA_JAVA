import java.util.Scanner;

public class max_subarr {
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
        int max_sum =0;
        System.out.println();
        while (k<arr.length) {
            for (int j = k; j < arr.length; j++) {

                int sum = 0;
                for (int t = k; t <= j; t++) {
                    System.out.print(arr[t]+" ");
                    sum += arr[t];                   
                }
                System.out.print("sum = "+ sum);
                if(sum>max_sum){
                    max_sum= sum;
                }
                System.out.println();
            }
            System.out.println();
            k++;
        }
        System.out.println("the maximum sum is "+ max_sum);
        sc.close();
    }
}
