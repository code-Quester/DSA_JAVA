public class touppercase {
    public static void main(String[] args) {
        String str = "    hey i am niloy! kuudos";
        StringBuilder sb = new StringBuilder("");
        int i=0;
        while (str.charAt(i)== ' ') {
            i++;
        }
        char ch = Character.toUpperCase(str.charAt(i));
        sb.append(ch);
        for (int j = i+1; j < str.length(); j++) {
            if (str.charAt(j)==' ' && j< str.length()-1 ) {
                sb.append(str.charAt(j));
                j++;
                sb.append(Character.toUpperCase(str.charAt(j)));
            }
            else{
                sb.append(str.charAt(j));
            }
        }

        System.out.println(" the result string is "+sb);
}
}
