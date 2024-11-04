package heaps;
import java.util.PriorityQueue;

public class connectNropes {
    public static void main(String[] args) {
        int ropes[] = {4,2,3,6,3};
        //greegy approach would give me the wrong answer
        // Arrays.sort(ropes);
        
        // if (ropes.length>2) {
        //     int arr[] =new int[ropes.length-1];
        //     arr[0] = ropes[0]+ropes[1];
        //     for (int i = 1; i < arr.length; i++) {
        //         arr[i] = arr[i-1] + ropes[i+1];
        //     }
        //     int sum =0;
        //     for (int i = 0; i < arr.length; i++) {
        //         sum+= arr[i];
        //     }
        //     System.out.println(sum);
        // }
        // else{
        //     System.out.println(ropes[0]+ropes[1]);
        // }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int cost =0;
        while (pq.size()>1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min+min2;
            pq.add(min+min2);
        }
        System.out.println(cost);
    }
}
