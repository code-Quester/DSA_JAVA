import java.lang.Math;
public class q3 {
    public static void main(String[] args) {
        int prices[]={7,3,9,1,8,5};
        int cp = prices[0];
        int profit =0;
        for (int i = 1; i < prices.length; i++) {
            int sp = prices[i];
            if (sp-cp>profit) {
                profit = sp-cp;
            }
            cp=Math.min(cp,prices[i]);
        }
        System.out.println("max profit can be "+ profit);
    }
}

