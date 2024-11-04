package bst_part1;

public class validateBst {
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
    }
    public static boolean checkBst(Node root, Node min, Node max){
        if (root == null) {
            return true;
        }
        if (min!=null && root.data <= min.data) {
            return false;
        }else if (max!=null && root.data >= max.data) {
            return false;
        }
        return checkBst(root.left, min, root) && checkBst(root.right, root, max);
    }
    public static void main(String[] args) {
        int values[]= {8,5,3,6,10,11,14};
        Node root = null;
        Bst tree = new Bst();
        for (int i = 0; i < values.length; i++) {
            root = tree.buildBst(root, values[i]);
        }
        System.out.println(checkBst(root,null,null));
    }
}
