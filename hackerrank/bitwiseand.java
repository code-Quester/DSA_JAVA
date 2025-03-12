package hackerrank;

public class bitwiseand {
    public static boolean check(int n){
        return (n & (n-1)) ==0;
        
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10,7,2,8,3};
        int count=0;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i] & arr[j];
                if (temp!=0 && check(temp)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
