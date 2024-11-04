package BinaryTrees;

public class minDistance {
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
    public static Node lca(Node root, int n1,int n2){
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca(root.left,n1,n2);
        Node rightLca = lca(root.right,n1,n2);

        if (leftLca == null) {
            return rightLca;
        }
        if (rightLca == null ) {
            return leftLca;
        }
        return root;
    }
    public static int distance(Node root,int d){
        if (root == null) {
            return -1;
        }
        if (root.data == d ) {
            return 0;
        }
        int ld = distance (root.left,d);
        int rd = distance (root.right,d);

        if (ld == -1 && rd == -1) {
            return -1;
        }else if (ld==-1) {
            return rd + 1;
        }else{
            return ld + 1;
        }
    }
    public static int mindistance(int d1,int d2,Node root){
        Node lca = lca(root,d1,d2);
        return distance(lca, d1) + distance(lca, d2);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorder(root);
        System.out.println();
        int d1 = 4;
        int d2 = 6;
        System.out.println(mindistance(d1,d2,root));
}
}
