import java.util.*;

public class stock_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days");
        int n = sc.nextInt();
        System.out.println("the price array");
        int price[]= new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i]=sc.nextInt();
        }

        int bp = price[0];
        int profit = 0;
        int sp =0;
        for (int i = 1; i < price.length; i++) {
            sp = price[i];
            if (sp-bp > profit){
                profit =sp-bp;
            }
            bp = Math.min(price[i], bp);
        }
        System.out.println("maximum profit is "+ profit);

        sc.close();
    }
}
