package bst_part1;
public class bst {
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
    public static class buildBst {
        public static Node build(Node root, int data){
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (root.data > data) {
                root.left = build(root.left, data);
            }else{
                root.right = build(root.right, data);
            }
            return root;
        }
        public void inorder(Node root){
            if (root ==null) {
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public Node bst(int values[]){
            Node root = null;
            for (int i = 0; i < values.length; i++) {
                root = build(root, values[i]);
            }
            return root;
        }
    }
    public static boolean search(Node root, int key){
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static Node inorderSuccessor(Node n){
        if (n.left == null) {
            return n;
        }
        return inorderSuccessor(n.left);
    }
    public static Node delete(Node root, int val){
        if (root.data > val) {
            root.left = delete(root.left, val);
        }else if (root.data < val) {
            root.right = delete(root.right, val);
        }else{
            // case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2: single child
            else if(root.left == null || root.right == null){
                if (root.left!= null) {
                    return root.left;
                }else{
                    return root.right;
                }
            }//case 3: 2 child
            else{
                Node iS = inorderSuccessor(root.right);
                root.data = iS.data;
                root.right = delete(root.right, iS.data);
            }

        }
        return root;
    }
    public static void printInRange(Node root, int k1, int k2){
        if (root == null) {
            return;
        }
        if (root.data >=k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if (root.data > k2) {
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        int values [] = {8,5,3,1,4,6,10,11,14};
        buildBst tree = new buildBst();
        Node root = tree.bst(values);
        tree.inorder(root);
        // System.out.println(search(root, 7));
        System.out.println();
        // root = delete(root, 8);
        // tree.inorder(root);
        printInRange(root, 6, 14);

    }
}
