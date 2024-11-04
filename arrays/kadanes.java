import java.util.Scanner;

public class kadanes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the elements");
        for ( int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int cs=0,ms =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if((cs+arr[i])<0){
                cs=0;
            }
            else{
                cs=cs+arr[i];
                if(ms<cs){
                    ms=cs;
                }
            }

        }
        
        System.out.println("the maximum sum is "+ ms);
        sc.close();
    }
}
