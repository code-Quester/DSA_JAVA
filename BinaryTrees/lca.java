package BinaryTrees;

import java.util.ArrayList;

public class lca {
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
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public void preorder(Node root){
            if (root ==null) {
                // System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static boolean getPath(Node root,int d,ArrayList<Node> path){
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == d) {
            return true;
        }

        boolean foundLeft  = getPath(root.left, d, path);
        boolean foundRight = getPath(root.right, d, path);

        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
        
    }
    public static int findLca(int d1,int d2,Node root){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,d1,path1);
        getPath(root,d2,path2);

        int i = 0;
        while (path1.get(i).data == path2.get(i).data) {
            i++;
        }
        return path1.get(i-1).data;
    }
    
    public static Node lca2(Node root, int n1,int n2){
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right,n1,n2);

        if (leftLca == null) {
            return rightLca;
        }
        if (rightLca == null ) {
            return leftLca;
        }
        return root;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorder(root);
        System.out.println();
        int d1 = 4;
        int d2 = 5;
        System.out.println(findLca(d1,d2,root));
        System.out.println(lca2(root, d1, d2).data);
}
}
