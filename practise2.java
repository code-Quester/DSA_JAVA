import java.util.Stack;

public class practise2 {
    public static void main(String[] args) {
        int arr[]= {2,5,1,9,3,5,4};
        int output[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        // for (int i = arr.length-1; i >=0; i--) {
        //     while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
        //         s.pop();
        //     }
        //     if (s.isEmpty()) {
        //         output[i] = -1;
        //     }
        //     else{
        //         output[i] = arr[s.peek()];
        //     }
        //     s.push(i);
        // }
        for (int i = 0; i <arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                output[i] = -1;
            }
            else{
                output[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }

    }
}
