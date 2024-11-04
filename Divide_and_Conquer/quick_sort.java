package Divide_and_Conquer;
public class quick_sort {
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int pivot_position(int arr[],int si, int ei){
        int i =si-1;
        int pivot = arr[ei];
        for (int j = si; j < ei; j++) {
            if (arr[j]<= pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }

    public static void q_sort(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
        int p = pivot_position(arr,si,ei);
        q_sort(arr, si, p-1);
        q_sort(arr, p+1, ei);
        
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5,-2};
        print(arr);
        q_sort(arr,0,arr.length-1);
        System.out.println("after the sorting");
        print(arr);
    }
}
