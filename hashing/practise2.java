package hashing;
import java.util.HashMap;

public class practise2 {
    public static void main(String[] args) {
        // HashMap <Integer,Integer> map = new HashMap<>();
        // int arr[] = {1,3,2,5,1,3,1,5,1};
        // for (int i = 0; i < arr.length; i++) {
        //     map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        // }
        // for (Integer key : map.keySet()) {
        //     if (map.get(key)> arr.length/3) {
        //         System.out.println(key);
        //     }
        // }

        String s1 = "race";
        String s2 = "care";
        HashMap <Character,Integer> map = new HashMap<>();
        if (s1.length()==s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            for (int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                if (map.containsKey(ch)) {              
                    if (map.get(ch) == 1) {
                        map.remove(ch, map.get(ch));
                    }
                    else{
                        map.put(ch, map.get(ch)-1);
                    }
                }
                else{
                    break;
                }
            }
            System.out.println(map.isEmpty());
            
        }
        else{
            System.out.println("they are not anagrams ");
        }

    }
}
