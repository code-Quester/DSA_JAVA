package recursion;
public class occurence {
    public static void indices(int arr[],int key,int ci){
        if (ci==arr.length) {
            return ;
        }
        if (arr[ci]==key) {
            System.out.print(ci+" ");
        }
        indices(arr, key, ci+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        indices(arr,key,0);
    }
}
