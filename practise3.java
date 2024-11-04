import java.util.*;

/**
 * practise3
 */
public class practise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c1 = Collections.frequency(Arrays.asList(s.split("")), "1");
        System.out.println(c1);
    }
}