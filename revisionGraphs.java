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
    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge> graph[],int curr,boolean vis[] ){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }
    public static boolean detectCycleDfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if(detectCycleDfsUtil(graph, i, vis, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleDfsUtil(ArrayList<Edge> graph[],int curr,boolean vis[],int par ){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                if(detectCycleDfsUtil(graph, e.dest, vis,curr)){
                    return true;
                }
            }else if (vis[e.dest] && par!=e.dest) {
                return true;
            }
        }
        return false;
    }
    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean[]vis){
        if (src==dest) {
            return true;
        }
        vis[src]= true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis))return true;
        }
        return false;
    }
    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int col[]= new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] =-1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < col.length; i++) {
            if (col[i]==-1) {
                q.add(i);
                col[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (col[e.dest]==-1) {
                            int nextCol = col[curr]==0?1:0;
                            col[e.dest]= nextCol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest]==col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
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
        // graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));

        graph[4].add(new Edge(4, 2, 0));
        // graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, 0));

        //bfs
        // bfs(graph);
        // System.out.println();
        // dfs(graph,0,new boolean[graph.length]);
        // System.out.println(hasPath(graph, 1, 6 , new boolean[graph.length]));
        dfs(graph);
        // System.out.println("Cycle exists : "+detectCycleDfs(graph));
        System.out.println(isBipartite(graph));
    }
}
