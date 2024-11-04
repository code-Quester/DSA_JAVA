
import java.util.*;
public class q2{
    public static int min_search(int new_arr[]){
        int left = 0;
        int right = new_arr.length-1;
        int mid=0;
        while (left<=right) {
            mid = (left+right)/2;
            if(mid>0 && new_arr[mid]< new_arr[mid-1]){
                return mid;
            }
            else if(new_arr[mid]<new_arr[left]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    public static void rotation(int arr[],  int pivot, int new_arr[]){    
        int k = 0;
        while (pivot<arr.length) {
            new_arr[k]= arr[pivot];
            k++;
            pivot++;
        }  
        while (k<arr.length) {
            new_arr[k]= arr[arr.length-pivot];
            k++;
            pivot--;
        } 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(new_arr[i]+" ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        }       
    }
    public static int search(int a[], int left, int right, int target){
        int mid  = (left+right)/2;
        if (left<=right) {
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                return search(a, mid+1, right, target);
            }
            else{
                return search(a, left, mid-1, target);
            }
        }
        return -1;

    }
    public static int search(int a[] , int target , int min){

        if (target>a[min]&&target<=a[a.length-1]){
            return search(a, min, a.length-1, target);
        }
        else{
            return search(a,0,min,target);
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {1,2,3,4,5};
        System.out.println("enter the pivot");
        int pivot = sc.nextInt();
        System.out.println("enter the target");
        int target = sc.nextInt();
        int new_arr[] = new int[arr.length];
        rotation(arr, pivot, new_arr);
        int min = min_search(new_arr);
        System.out.println();
        if (target ==new_arr[min]) {
            System.out.println("the position is :"+ min);
        }
        else{
            int index =search(new_arr, target, min);
            if (index == -1){
                System.out.println("not found");
            }
            else{
                System.out.println("the position is :"+ index);
            }
        }


        sc.close();
    }
}
