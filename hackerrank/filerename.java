package hackerrank;

import java.util.HashMap;

public class filerename {

    public static int countWays(String nw, String old, int index1,int index2,HashMap<String,Integer> map) {
        if (index2==nw.length()) {
            return 1;
        }
        if (index1==old.length()) {
            return 0;         
        }
        if (map.containsKey(index1+" "+index2)) {
            return map.get(index1+" "+index2);
        }
        int ways=0;
        if (nw.charAt(index2) == old.charAt(index1)) {
            ways+=countWays(nw, old, index1+1, index2+1,map);
        }
        ways+=countWays(nw, old,index1+1,index2,map);
        map.put(index1+" "+index2, ways);
        return ways ;
    }
    public static void main(String[] args) {
        String nw = "aba";
        String old = "ababa";
        int count = countWays(nw, old,0,0,new HashMap<>());
        System.out.println(count);
    }
}
