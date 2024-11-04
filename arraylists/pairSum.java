package arraylists;
import java.util.ArrayList;

public class pairSum {
    public static boolean checkTargetSum(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size() -1;
        int sum = 0;
        while (lp<rp) {
            sum =list.get(rp)+ list.get(lp);
            if (sum == target) {
                return true;
            }
            else if (sum < target) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static boolean checkTargetSum2(ArrayList<Integer> list,int target){
        //find the pivot point
        int i =0;
        while (list.get(i)<list.get(i+1)) {
            i++;
        }
        int rp = i;
        int lp = i+1;
        int sum = 0;
        while (lp!=rp) {
            sum =list.get(rp)+ list.get(lp);
            if (sum == target) {
                return true;
            }
            else if (sum < target) {
                lp++;
                if (lp == list.size()) {
                    lp =0;
                }
            }else{
                rp--;
                if (rp<0) {
                    rp = list.size()-1;
                }
            }
        }return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(checkTargetSum(list,50));
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(checkTargetSum2(list1,21));

        
    }
}
