/**
 * diagonal_sum
 */
public class diagonal_sum {

    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i][i];
            if (i!= a.length-1 -i) {

                sum+=a[i][a.length-1-i];
            }
        }
        System.out.println("the diagonal sum is "+ sum);

    }
}