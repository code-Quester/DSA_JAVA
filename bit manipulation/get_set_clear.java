import java.util.Scanner;

public class get_set_clear {
    public static void get(int n, int i){
        int bitmask = 1<<i;
        if ((n & bitmask) == 0) {
            System.out.println(i+ "th bit is 0");
        }
        else{
            System.out.println(i+"th bit is 1");

        }
        return;
    }
    public static void set(int n, int i){
        int bitmask = 1<<i;
        System.out.println(n|bitmask);
        return;
    }


    public static void clear(int n , int i){
        int bitmask = ~(1<<i);
        System.out.println(n&bitmask);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("enter the position");
        int i = sc.nextInt();
        get(n,i);
        set(n,i);
        clear(n,i);
        sc.close();
    }
}
