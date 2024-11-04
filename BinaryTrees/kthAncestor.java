package BinaryTrees;

public class kthAncestor {
    static class Node {
        int data;
        Node left;
        Node right;
        boolean b;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            this.b = false;
        }
    }
    public static void preorder(Node root){
        if (root ==null) {
            // System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int findKthAncestor(Node root, int n, int k){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int ld = findKthAncestor(root.left, n, k);
        int rd = findKthAncestor(root.right, n, k);

        if (ld == -1 && rd == -1) {
            return -1;
        }
        else if (ld == -1) {
            if (root.right.b == true) {
                root.b =true;
                return rd;
            }else if (rd+1 ==k) {
                root.b =true;
                return root.data;
            }else{
                return rd+1;
            }
        }else{
            if (root.left.b == true) {
                root.b =true;
                return ld;
            }else if (ld+1 == k) {
                root.b =true;
                return root.data;
            }else{
                return ld+1;
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node (7);
        preorder(root);
        System.out.println();
        int n = 4;
        int k = 2;
        System.out.println(findKthAncestor(root,n,k));

    }
}
