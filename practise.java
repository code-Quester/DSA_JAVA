// import java.util.Scanner;

// public class practise {
//     p   if (si>=ei) {
//             return;
//         }
//         int pivot = partition(arr,si,ei);
//         q_sort(arr, si, pivot-1);
//         q_sort(arr,pivot+1,ei);
        
//     }
//     public static int partition(int arr[],int si,int ei){
//         int i= si-1;
//         int pivot = arr[ei];
//         for (int j = si; j < ei; j++) {
//             if(arr[j]<=pivot){
//                 i++;
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i]=temp;
//             }
//         }
//         i++;
//         int temp = arr[ei];
//         arr[ei] = arr[i];
//         arr[i]=temp;  
        
//         return i;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[]= new int[5];
//         System.out.println("enter 5 elements to be sorted ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         q_sort(arr,0,arr.length-1);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         sc.close();ublic static void q_sort(int arr[],int si,int ei){
     
//     }
// }

/**
 * practise
 */
public class practise {

    public static void main(String[] args) {
        String str = new String("abcdabcabcdf");
        String pattern = "abcdf";
        char original_string[] =  str.toCharArray();
        char p[]= pattern.toCharArray();
        int i;
        for (i = 0; i <=original_string.length-p.length; i++) {
            int j;
            for (j = 0; j < p.length  ; j++) {
                if (original_string[i+j] != p[j]){
                    break;
                }
            }
            if (j == p.length){
                System.out.println("pattern found");
                System.out.println("starting from "+ i);
                break;
            }
        }
    }
}