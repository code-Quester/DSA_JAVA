package hashing;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class practise3 {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // int num[]={1,2,3,1,2,3,4,5};
        // for (int i = 0; i < num.length; i++) {
        //     set.add(num[i]);
        // }
        // System.out.println(set.size());

        HashSet <Integer> set = new HashSet<>();
        int num1[]={1,2,3,1};
        int num2[]={1,2,3,1,2,3,4,5,6};
        // for (int i = 0; i < num1.length; i++) {
        //         set.add(num1[i]);
        // }
        // for (int i = 0; i < num2.length; i++) {
        //         set.add(num2[i]);
        // }
        // System.out.println("union");
        // for (int i : set) {
        //     System.out.print(i+" ");
        // }
        
        // System.out.println("intersection");
        // for (int i = 0; i < num1.length; i++) {
        //     set.add(num1[i]);
        // }
        // int c=0;
        // for (int i = 0; i < num2.length; i++) {
        //     if (set.contains(num2[i])) {
        //         c++;
        //         System.out.print(num2[i]+" ");
        //         set.remove(num2[i]);
        //     }
        // }
        // System.out.println("number of elements common " + c);

        // HashMap<String,String> ticket = new HashMap<>();
        // ticket.put("chennai","bengaluru");
        // ticket.put("mumbai","delhi");
        // ticket.put("goa","chennai");
        // ticket.put("delhi","goa");        
        // String starting_place="";
        // // Collection<String> dest = ticket.values();
        // for (String start : ticket.keySet()) {
        //     if (ticket.values().contains(start) == false) {
        //         starting_place = start;
        //         break;
        //     }
        // }
        // System.out.print(starting_place);
        // for (String key : ticket.keySet()) {
        //     System.out.print("->"+ticket.get(starting_place));
        //     starting_place = ticket.get(starting_place);
        // }

        // HashMap<Integer,Integer> map = new HashMap<>();
        // int arr[]={-1,1,-1,1,-1,1};
        // int arr1[]={15,-2,2,-8,1,7,10,23};

        // int curr_sum = 0; 
        // int l=0;
        // for (int i = 0; i < arr.length; i++) {
        //     curr_sum +=arr[i];
        //     if (curr_sum==0){
        //         l = i+1;
        //     }
        //     if (map.containsKey(curr_sum)) {
        //         l = Math.max(l, i - map.get(curr_sum));
        //     }
        //     else{
        //         map.put(curr_sum, i);
        //     }
        // }
        // System.out.println("the maximum size of zero sum subarray is " + l); 

        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 5;
        int arr[]={2,0,0,4,-1};
        int curr_sum=0;
        int start = 0 , end =-1;
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if (curr_sum - k == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(curr_sum-k)) {
                start = map.get(curr_sum-k)+1;
                end = i;
                break;
            }
            map.put(curr_sum, i);
        }
        if (end == -1){
            System.out.println("not found");
        }
        else{
            System.out.println(start + " "+ end);
        }
    }
}
