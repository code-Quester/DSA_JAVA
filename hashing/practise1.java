package hashing;

// public class practise1 {
//     public static void rem_dup(String str, int arr[],int i,StringBuilder sb){
//         if (i==str.length()) {
//             System.out.println(sb);
//             return;
//         }
//         char ch = str.charAt(i);
//         int index = ch - 'a';
//         if (arr[index]==1) {
//             rem_dup(str, arr, i+1, sb);
//         }
//         else{
//             arr[index]=1;
//             sb.append(ch);
//             rem_dup(str, arr, i+1, sb);
//         }
        
//     }
//     public static void main(String[] args) {
//         String str = "appnacollege";
//         int arr[]= new int[26];
//         rem_dup(str,arr,0,new StringBuilder());
//     }
// }
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class practise1 {
    public static String removeDuplicates(String input) {
        Set<Character> charSet = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            // if (charSet.add(c)) {
            //     result.append(c);
            // }
            charSet.add(c);
        }
        for (Character character : charSet) {
            System.out.print(character);
        }
        
        System.out.print(charSet);
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String output = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + output);
    }
}

