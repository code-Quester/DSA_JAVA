package sorting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class inbuilt_sort {
    public static void main(String[] args) {
        Integer arr[]={5,4,7,1,2};

        Arrays.sort(arr,0,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        Arrays.sort(arr,Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
