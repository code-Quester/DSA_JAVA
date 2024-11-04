package stacks;

import java.util.*;
public class Stack_decodeString {
    static int currIdx = 0;
    public static String decodeString(String s){
        StringBuilder result = new StringBuilder();
        int count = 0;

        while (currIdx<s.length()) {
            char ch = s.charAt(currIdx);
            if(Character.isDigit(ch)) {
                count = 10*count + (s.charAt(currIdx) - '0');
                currIdx++;
            }
            else if (ch == '[') {
                currIdx++;
                String temp = decodeString(s);
                for (int i = 0; i < count; i++) {
                    result.append(temp);
                }
                count =0;
            }
            else if (ch == ']') {
                return result.toString();
            }
            else{
                result.append(ch);
                currIdx++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String decodedString = decodeString(s);
        System.out.println("decoded string : "+ decodedString);
    }
}