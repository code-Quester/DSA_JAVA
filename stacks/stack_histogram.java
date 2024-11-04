package stacks;
import java.util.*;
public class stack_histogram {
    public static int area(int arr[]){
        int left[]=new int[arr.length];
        int right[]= new int[arr.length];
        Stack<Integer> s = new Stack<>();
        //next smaller right
        for (int i = arr.length -1; i >=0; i--) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                right[i] = arr.length;
            }
            else{
                right[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();
        //next smaller left
        for (int i = 0; i <arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                left[i] = -1;
            }
            else{
                left[i] = s.peek();
            }
            s.push(i);
        }
        // for (int i = 0; i < arr.length; i++) {
        //     int j =i+1;
        //     while (j<arr.length && arr[j]>=arr[i]) {
        //         right[i]++;
        //         j++;
        //     }
        //     int k =i-1;
        //     while ( k>=0 && arr[k]>=arr[i]) {
        //         left[i]++;
        //         k--;
        //     }
        // }
        int max_area = 0;
        for (int i = 0; i < arr.length; i++) {
            int area = arr[i] * (right[i]-left[i]-1);
            max_area = Math.max(max_area, area);
        }
        return max_area;
    }

    public static void main(String[] args) {
        // int arr[]= {2,1,5,6,2,3};
        int arr2[] = {8,3,9,2,4,5};
        System.out.println("the maximum rec area in the histogram  is "+ area(arr2));
    }
}