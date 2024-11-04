package strings_assignment;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        int c = 0;
        for(int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch =='e'||ch=='i'||ch=='o'|ch=='u'){
                c++;
            }
        }
        System.out.println("number of times lower case vowel appears "+ c);
        sc.close();
        
    }
}
