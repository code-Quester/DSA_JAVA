import java.util.*;
public class revisionGraphs {
    public static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int source, int dest, int weight){
            this.src = source;
            this.dest= dest;
            this.weight = weight;
        }
    }
    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[]= new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        while (!q.isEmpty()) {
            int ele = q.remove();
            if(!vis[ele]){
                System.out.print(ele + " ");
                vis[ele]= true;
                for (int i = 0; i < graph[ele].size(); i++) {
                    Edge e = graph[ele].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph []= new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));

        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, 0));

        //bfs
        bfs(graph);
    }
}
