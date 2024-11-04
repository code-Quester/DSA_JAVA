package heaps;
import java.util.*;

public class weakestSoldier {
    public static class Row implements Comparable<Row>{
        int idx;
        int n;
        public Row(int n, int idx){
            this.n = n;
            this.idx =idx;
        }
        @Override
        public int compareTo(Row r){
            if (this.n == r.n) {
                return this.idx - r.idx;
            }
            return this.n- r.n;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,0,0,0},
                     {1,1,1,1},
                     {1,0,0,0},
                     {1,0,0,0}};
        int k=2;             
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==1) {
                    count++;
                }
            }
            pq.add(new Row(count, i));
        }
        while (!pq.isEmpty() && k>0) {
            System.out.print("R"+ pq.remove().idx+" ");
            k--;
        }

    }
}
