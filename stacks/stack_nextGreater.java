package stacks;
// import java.util.ArrayList;
import java.util.Stack;

public class stack_nextGreater {
    public static int[] nextGreater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int output[] = new int[arr.length];

        for(int i = arr.length -1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                output[i]= -1;
            }
            else{
                output[i]= arr[s.peek()];
            }
            s.push(i);
        }
        return output;
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        // int arr[] ={1,2,3,4,5};
        // int arr[] = {5,4,3,2,1};
        int o[]=nextGreater(arr);
        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i]+" ");
        }
    }
}
