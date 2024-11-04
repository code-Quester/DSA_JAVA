public class clear_bits {
    public static void main(String[] args) {
        int n = 15;
        int i=2;
        // n=n>>i;
        // n=n<<i;
        // System.out.println(n);
        int bitmask=-1;
        bitmask = bitmask<<i;
        n=n&bitmask;
        System.out.println(n);
    }
}
