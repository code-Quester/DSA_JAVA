package graphs;
import java.util.*;

public class BipartiteGraph {

    public static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int source,int destination , int weight){
            this.src = source;
            this.dest = destination;
            this.weight = weight;
        }
    }
    public static boolean gc(ArrayList<Edge> graph[]){
        int col[] =new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i]=-1;
        }
        for (int i = 0; i < col.length; i++) {
            if (col[i] == -1) {
                if (!gcUtil(graph,col,i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean gcUtil(ArrayList<Edge> graph[] , int col[] , int curr){
        Queue<Integer> q = new LinkedList<>();
        q.add(curr);
        col[curr] = 0;
        while (!q.isEmpty()) {
            curr = q.remove();
            int newCol = 0;
            if (col[curr] == 0) {
                newCol = 1;
            }
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (col[e.dest] == -1) {
                    col[e.dest] = newCol;
                    q.add(e.dest);
                }else if (col[e.dest] == col[curr]) {
                    return false;
                } 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph [] =new ArrayList[v];

        for(int i = 0; i<v;i++){
            graph[i] =new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));

        // graph[4].add(new Edge(4, 2, 1));
        // graph[4].add(new Edge(4, 3, 1));

        if (gc(graph)) {
            System.out.println("It is bipartite");
        }else{
            System.out.println("Not bipartite");
        }
    }
}



