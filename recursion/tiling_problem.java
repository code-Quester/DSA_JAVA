package recursion;
public class tiling_problem {
    public static int placing_tiles(int n){
        if (n==0){
            return 1;
        }
        else if (n ==1){
            return 1;
        }
        return placing_tiles(n-1) + placing_tiles(n-2);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println("number of ways "+ placing_tiles(n));
    }
}
