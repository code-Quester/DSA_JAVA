package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class topviewTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    static class Info{
        int hd;
        Node node;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topview(Node root){
        Queue<Info> q = new LinkedList<>();
        int min =0,max=0;
        HashMap<Integer,Node> map = new HashMap<>();
        
        q.add(new Info(root,0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left !=null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if (curr.node.right !=null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
    
                }
            }
            
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left =new Node(2);
        root.right = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        root.left.right = node4;
        node4.right = node5;
        node5.right = node6;

        topview(root);
    }
}
