package Divide_and_Conquer;
public class rotated_sortedarray {
    public static int search (int arr[],int target,int si,int ei){
        if (si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        //kaam
        if (arr[mid]==target){
            return mid;
        }

        //mid on l1
        if(arr[si]<= arr[mid]){
            //case a
            if (arr[si]<=target && target<arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //case b 
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        //mid on l2
        else{
            //case c
            if (arr[mid]<target && target<=arr[ei]) {
                return search(arr, target, mid+1, ei);
            }
            // case d
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target = 4;
        int target_idx = search(arr,target,0,arr.length-1);
        System.out.println("index of the target is "+ target_idx);
    }
}
