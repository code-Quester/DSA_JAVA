package stacks;
public class StringDecoder {
    
    public static String decodeString(String s) {
        return decodeHelper(s, new int[]{0});
    }

    private static String decodeHelper(String s, int[] index) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        while (index[0] < s.length()) {
            char currentChar = s.charAt(index[0]);

            if (Character.isDigit(currentChar)) {
                count = 10 * count + (currentChar - '0');
                index[0]++;
            } else if (currentChar == '[') {
                index[0]++;  // Skip '['
                String decodedString = decodeHelper(s, index);
                for (int i = 0; i < count; i++) {
                    result.append(decodedString);
                }
                count = 0;  // Reset count after processing
            } else if (currentChar == ']') {
                index[0]++;  // Skip ']'
                return result.toString();
            } else {
                result.append(currentChar);
                index[0]++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String encodedString1 = "2[cv]";
        String encodedString2 = "3[b2[v]]";

        System.out.println("Decoded String 1: " + decodeString(encodedString1)); // cvcv
        System.out.println("Decoded String 2: " + decodeString(encodedString2)); // bvvbvvbvv
    }
}
