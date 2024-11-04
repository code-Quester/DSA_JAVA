package recursion;


// code to print binary strings without consecutive ones

public class print_binarystrings {

    public static void binary_strings(int lp,int n,String sb){
        if (n==0){
            System.out.println(sb);
            return;
        }
        binary_strings(0, n-1, sb+"0");
        if (lp==0){
            binary_strings(1, n-1, sb+"1");
        }
    }
    public static void main(String[] args) {
        int n=2;
        binary_strings(0,n,new String(""));
    }
}

//code to print all binary strings of given length

// public class print_binarystrings {

//     public static void binary_strings(int n,String sb){
//         if (n==0){
//             System.out.println(sb);
//             return;
//         }
//         binary_strings(n-1, sb+"0");

//         binary_strings(n-1, sb+"1");
//     }
//     public static void main(String[] args) {
//         int n=4;
//         binary_strings(n,new String(""));
//     }
// }