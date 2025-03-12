package bst_part1;
import java.util.ArrayList;

public class calcPathsBst {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Bst {
        public Node buildBst(Node root, int val){
            if (root ==null) {
                root = new Node(val);
                return root;
            }
            if (root.data > val) {
                root.left = buildBst(root.left, val);
            }else if (root.data< val) {
                root.right = buildBst(root.right, val);
            }
            return root;
        }
        public void inorder(Node root){
            if (root== null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void rootToLeafPaths(Node root,ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(path);
        }
        rootToLeafPaths(root.left, path);
        rootToLeafPaths(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[]= {8,5,3,6,10,11,14};
        Node root = null;
        Bst tree = new Bst();
        for (int i = 0; i < values.length; i++) {
            root = tree.buildBst(root, values[i]);
        }
        tree.inorder(root);
        System.out.println();
        rootToLeafPaths(root,new ArrayList<>());
    }
}
