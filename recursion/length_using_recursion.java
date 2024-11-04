package recursion;
import java.util.Scanner;

/**
 * length_using_recursion
 */
public class length_using_recursion {
    public static int lgth(String str){
        if (str=="") {
            return 0;
        }

        return lgth(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("the length of the string "+ lgth(str));
    }
}