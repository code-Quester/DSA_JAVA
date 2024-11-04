
public class twod_q2 {
    public static void main(String[] args) {
        int arr[][]={{1,2,7},{3,4,7}};
        int sum=0;
        for (int i = 0; i < arr[0].length; i++) {
            sum+=arr[1][i];
        }
        System.out.println(sum);
    }
}
