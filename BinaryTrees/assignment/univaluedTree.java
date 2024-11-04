package BinaryTrees.assignment;

public class univaluedTree {
    /**
     * Node
     */
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    public static class binaryTree {
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
            if (root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        
    }
    public static boolean checkunival(Node root,int d){
        if (root == null) {
            return true;
        }
        if (root.data !=d) {
            return false;
        }
        return checkunival(root.left, d) && checkunival(root.right, d); 
    }
    public static void main(String[] args) {
        // int nodes[]= {2,2,5,-1,-1,2,-1,-1,2,-1,-1};
        int nodes[]= {2,2,2,-1,-1,2,-1,-1,2,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorder(root);
        System.out.println(checkunival(root,root.data));
    }
}
