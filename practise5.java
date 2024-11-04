import java.util.*;


public class practise5 {

    public static boolean check(String str , int idx){
        if (idx == str.length()) {
            return true;
        }
        char ch = str.charAt(idx);
        if (ch != '0' && ch!= '1') {
            return false;
        }
        else if (ch == '1'){
            if (idx< str.length()-1 && ch == str.charAt(idx+1)) {
                return false;
            }
        }
        return check(str, idx+1);
    }
    public static void permutationsForStrings (String str, String newString){
        if (str == "") {
            System.out.println(newString);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permutationsForStrings(str.replaceFirst(String.valueOf(str.charAt(i)), ""), newString+str.charAt(i));
        }
    }
    public static void permutationsForArrays (List<Integer> arr, ArrayList<Integer> newlist){
        if (arr.isEmpty()) {
            System.out.println(newlist);
            return;
        }
        int l = arr.size();
        for (int i = 0; i < l; i++) {
            int deletedElement  =  arr.remove(i);
            newlist.add(deletedElement);
            permutationsForArrays(arr, newlist);
            arr.add(i,deletedElement);
            newlist.remove(newlist.size()-1);
        }
    }
    public static void main(String[] args) {
        // System.out.println(check ("101",0));

        permutationsForStrings("abc",new String());
        Integer arr [] = {1,2,3};
        permutationsForArrays(new ArrayList<>(Arrays.asList(arr)),new ArrayList<>());
    }
}
