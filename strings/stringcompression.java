public class stringcompression {
    public static void main(String[] args) {
        String str = "aaabhbbcccccde";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int c= 1;
            char ch = str.charAt(i);
            sb.append(ch);
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                c++;
                i++;
            }
            if (c>1){
                sb.append(c);

            }
        }
        System.out.println(sb);
    }
}
