package graphs;

import java.util.*;

public class AllPaths {
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
    public static void paths(ArrayList<Edge> graph[],int source,int dest,String path){
        if(source == dest) {
            System.out.println(path+dest);
            return;
        }
        for (int i = 0; i < graph[source].size(); i++) {
            Edge e = graph[source].get(i);
            paths(graph, e.dest, dest, path+source);
        }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph [] = new ArrayList[v];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3, 0));

        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 1, 0));

        graph[4].add(new Edge(4, 0, 0));
        graph[4].add(new Edge(4, 1, 0));

        graph[5].add(new Edge(5, 0, 0));
        graph[5].add(new Edge(5, 2, 0));

        paths(graph, 5, 1, "");
    }
}
