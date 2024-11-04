

// public class pp1 {
//     public static void dec2bin(int n){
//         int bin=0;int d;int c=0;
//         while (n!=0) {
//             d = n%2;
//             n=n/2;
//             bin = bin + d* (int)Math.pow(10,c++);
            
//         }
//         System.out.println(bin);
//     }
//     public static void dec2bin_rec(int n,int bin,int c){
//         if (n==0){
//             System.out.println(bin);
//             return;
//         }
//         int d =n%2;
//         bin = bin + d* (int)Math.pow(10,c);
//         dec2bin_rec(n/2, bin,c+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number: ");
//         int n =sc.nextInt();
//         // dec2bin(n);
//         dec2bin_rec(n,0,0);
//     }
// }

// public class pp1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string ");
//         String str = sc.nextLine();
//         char arr[]= str.toCharArray();
//         for (int i = 0; i < arr.length-1; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 String s = new String();
//                 for (int j2 = i; j2 <=j; j2++) {
//                     s = s+ arr[j2];
//                 }
//                 System.out.print( s+" ");
                
//             }
//             System.out.println();
//         }
//     }
// }
 
/**
 * pp1
 */
// public class pp1 {

//     public static void main(String[] args) {
//         int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//         int start_row= 0;
//         int end_row = arr.length-1;

//         int start_col=0;
//         int end_col= arr[0].length-1;

//         while (start_row<= end_row && start_col<= end_col) {
//             for (int j = start_col; j <=end_col; j++) {
//                 System.out.print(arr[start_row][j]+" ");
//             }
//             for (int i = start_row+1; i <= end_row; i++) {
//                 System.out.print(arr[i][end_col]+" ");
//             }

//             for (int j = end_col-1 ; j >=start_col; j--) {
//                 System.out.print(arr[end_row][j]+" ");
//             }
//             for (int i = end_row-1; i > start_row; i--) {
//                 System.out.print(arr[i][start_col]+" ");
//             }
//             start_col++;
//             end_col--;
//             start_row++;
//             end_row--;
//         }
//     }
// }
import java.util.ArrayList;

public class pp1 {

    // Function to check if a substring is palindrome
    private static boolean isPalindrome(char[] s, int start, int end) {
        while (start < end) {
            if (s[start] != s[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to find all palindromic substrings
    public static ArrayList<String> findAllPalindromicSubstrings(String s) {
        ArrayList<String> palindromes = new ArrayList<>();
        int n = s.length();
        char[] charArray = s.toCharArray();

        // Check all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(charArray, i, j)) {
                    palindromes.add(s.substring(i, j + 1));
                }
            }
        }

        return palindromes;
    }

    public static void main(String[] args) {
        String input = "ababa";
        ArrayList<String> palindromes = findAllPalindromicSubstrings(input);

        System.out.println("Palindromic substrings are: ");
        for (int i = 0; i < palindromes.size(); i++) {
            System.out.println(palindromes.get(i));
        }
    }
}
