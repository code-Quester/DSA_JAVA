package heaps;
import java.util.*;

public class nearestNcars {
    static class Point implements Comparable<Point> {
    
        int x;
        int y;
        int distsqr;
        int idx;
        Point(int x,int y, int distsqr,int i){
            this.x = x;
            this.y = y;
            this.distsqr =distsqr;
            idx =i;
        }
        @Override
        public int compareTo(Point p){
            return this.distsqr - p.distsqr;
        }
    }
    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distsqr = (int)(Math.pow(pts[i][0],2)+Math.pow(pts[i][1],2));
            pq.add(new Point(pts[i][0],pts[i][1],distsqr,i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C"+ pq.remove().idx);
        }
        
    }
}
