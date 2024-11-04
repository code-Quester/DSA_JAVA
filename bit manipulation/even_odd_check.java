public class even_odd_check {
    public static void main(String[] args) {
        int n = 4;
        int bit_mask = 1;
        if((n & bit_mask ) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
