package graphs;
import java.util.*;
public class connectedComponents {

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
    public static void bfs(ArrayList<Edge> graph[]) {
        boolean vis[] =new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsUtil(graph,i, vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge> graph[],int src, boolean vis[] ){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr+" ");
                vis[curr] =true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[]) {
        boolean vis[] =new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
            }
        }

    }
    public static void dfsUtil(ArrayList<Edge> graph [], int curr, boolean vis[]){
        if (!vis[curr]) {
            System.out.print(curr+" ");
            vis[curr] =true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                dfsUtil(graph, e.dest, vis);
            }
        } 
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph [] =new ArrayList[v];

        for(int i = 0; i<v;i++){
            graph[i] =new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        // graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        // graph[4].add(new Edge(4, 5, 1));

        // graph[5].add(new Edge(5, 3, 1));
        // graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

        bfs(graph);
        System.out.println();
        dfs(graph);
    }
}


