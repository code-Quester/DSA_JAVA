import java.util.*;
/**
 * revisionHashing
 */
public class revisionHashing {

    public static void main(String[] args) {
        // HashSet<Integer> hs = new HashSet<>();

        // //intersection
        // int arr1[]={1,2,3};
        // int arr2[]= {2,3,4,5};

        // for(int i: arr1){
        //     hs.add(i);
        // }
        // int c=0;
        // for(int i:arr2){
        //     if(hs.contains(i)){
        //         c++;
        //         hs.remove(i);
        //     }
        // }
        // System.out.println(c);

        int arr[]={1,2,3,-1,-2,5};
        int n = arr.length;
        int max = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int sum = 0;
        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
        //         }
        //         if (sum==0) {
        //             max = Math.max(max, j-i+1);
        //         }
        //     }
        // }
        // System.out.println(max);
        int currSum =0;
        int count =0;
        int target = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            currSum += arr[i];
            if(map.containsKey(currSum-target)){
                count += map.get(currSum - target);
            }
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }
        System.out.println(count);
    }
}