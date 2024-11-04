package heaps;
import java.util.*;
/**
 * SlidingWIndowMax
 */
public class SlidingWIndowMax {
    static class Element implements Comparable<Element> {
        int val;
        int idx;
        public Element(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Element e){
            return  e.val- this.val;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        int k=3;
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for (int i =0; i < k; i++) {
            pq.add(new Element(arr[i],i));
        }
        list.add(pq.peek().val);
        for (int i = k; i < arr.length; i++) {
            while (pq.peek().idx <= i-k) {
                pq.remove();
            }
            pq.add(new Element(arr[i], i));
            list.add(pq.peek().val);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}