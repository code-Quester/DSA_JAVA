package backtracking;

public class permutations {
    static int a = 1;
    public static void find_permutations(String str, String p){
        if (str.length()==0) {
            System.out.println(p + " "+ (a++));
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            find_permutations(str.replaceFirst(String.valueOf(str.charAt(j)), ""), p+str.charAt(j));
        }
    }
    public static void main(String[] args) {
        String str = "123";
        find_permutations(str,new String());

    }
}
