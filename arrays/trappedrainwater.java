import java.util.*;

public class trappedrainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER NUMBER OF BLOCKS");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the height of the blocks");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //left max boundary
        int leftmax[] = new int[n];
        leftmax[0]= arr[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i]= Math.max(leftmax[i-1],arr[i]);
        }

        //rightmax boundary
        int rightmax[]=new int[n];
        rightmax[n-1]= arr[n-1];
        for (int i = n-2; i >=0; i--) {
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int total=0;
        for (int i = 1; i < arr.length-1; i++) {
            int water_level = Math.min(leftmax[i],rightmax[i]);
            int trapped_water = water_level-arr[i];
            total +=trapped_water;
        }
        System.out.println("total trapped water is "+ total);
        sc.close();
    }
}
