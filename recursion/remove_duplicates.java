package recursion;
public class remove_duplicates {

    public static void remove_dups(String s , boolean map[], int curr_idx, StringBuilder sb1 ){
        if (curr_idx==s.length()){
            System.out.println(sb1);
            return;
        }
        char ch = s.charAt(curr_idx);
        if (map[ch -'a'] == false) {
            sb1.append(ch);
            map[ch -'a'] = true;
            remove_dups(s, map, curr_idx+1, sb1);
        }
        else{
            remove_dups(s, map, curr_idx+1, sb1);
        }
    }
    public static void main(String[] args) {
        
        // StringBuilder sb1 = new StringBuilder();
        // for (int i=0;i<sb.length();i++){
        //     if (sb1.indexOf(String.valueOf(sb.charAt(i)))==-1){
        //         sb1.append(sb.charAt(i));
        //     }
        // }

        boolean map[]= new boolean[26];
        // for (int i = 0; i < map.length; i++) {
        //     map[i]= false;
        // }
        StringBuilder sb1 = new StringBuilder("");
        remove_dups("appnacollege",map,0,sb1);

    }

}
