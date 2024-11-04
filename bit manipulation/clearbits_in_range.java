import java.util.Scanner;

public class clearbits_in_range {
    public static void clear_bits(int n,int i, int j){
        int a= -1 << (j+1);
        int b= (1<<i) -1 ;
        int bitmask = a|b;
        System.out.println(n&bitmask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("enter the ith position and the jth position");
        int i =sc.nextInt();
        int j =sc.nextInt();
        clear_bits(n,i,j);
        sc.close();
    }
}
