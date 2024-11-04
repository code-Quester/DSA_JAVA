package heaps;
import java.util.ArrayList;

public class Heaps {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int minidx=i;
            int left = 2*i+1;
            int right = 2*i+2;

            if (left<arr.size() && arr.get(left)<arr.get(minidx)) {
                minidx = left;
            }
            if (right<arr.size() && arr.get(right)<arr.get(minidx)) {
                minidx = right;
            }

            if(minidx !=i) {
              int temp = arr.get(i);
              arr.set(i, arr.get(minidx));
              arr.set(minidx, temp);

              heapify(minidx);
            }
        }
        public int remove(){
            int data = arr.get(0);
            //swap root and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //remove last idx
            arr.remove(arr.size()-1);

            //fix the heap(heapify)
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(10);
        pq.add(1);
        System.out.println(pq.arr);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
