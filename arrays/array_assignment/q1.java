
import java.util.*;

public class q1 {
    public static boolean check(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return true; 
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println( check(arr)); 
    }
}
