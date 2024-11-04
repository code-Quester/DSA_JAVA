import java.util.*;

public class trapping_rainwater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of blocks");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the height of the blocks");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int max = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
                continue;
            }


            int j= i;
            while( (j+1<n) && ((arr[j]>= arr[j+1]))){
                j++;
            }
            int k=j+1;
            while(k+1<n && (arr[k]<= arr[k+1]) ){
                k++;
            }
            int x = Math.min(max, arr[k]);
            for (int l = i; l < k; l++) {
                if (x-arr[l]>0){
                    sum+=(x-arr[l]);
                }


            }
            i=k-1;
        }
        System.out.println("the trapped rainwater ="+ sum);
        sc.close();
    }
}
