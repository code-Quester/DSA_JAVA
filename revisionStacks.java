import java.util.Stack;

public class revisionStacks {
    public static void pushAtBottom(Stack<Integer> s, int ele){
        if (s.isEmpty()) {
            s.push(ele);
            return;
        }
        int removedElement = s.pop();
        pushAtBottom(s, ele);
        s.push(removedElement);
        return;
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int removedElement = s.pop();
        reverseStack(s);
        pushAtBottom(s, removedElement);
        return;
    }
    public static void print(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
    public static void nextGreater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[arr.length];
        // res[arr.length-1] = -1;
        // s.push(arr[arr.length-1]);
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>s.peek()){
                s.pop();
            }
            if (s.isEmpty()) {
                res[i]=-1;
            }else res[i] = s.peek();
            s.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // reverseStack(s);
        // print(s);
        int arr[]={6,8,0,1,3};
        nextGreater(arr);
    }
}
