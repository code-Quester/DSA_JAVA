package BinaryTrees;
public class subtree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left = null;
            this.right =null;
        }
    }
    public static class BinaryTree {
        static int idx = -1;
        public Node Buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = Buildtree(nodes);
            newNode.right = Buildtree(nodes);
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
    public static boolean isIdentical(Node node1,Node node2){
        if (node1 ==null && node2 ==null) {
            return true;
        }
        else if (node1 == null || node2 ==null ||node1.data != node2.data) {
            return false;
        }
        return isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
    }
    
    public static boolean isSubtree (Node root,Node subroot){
        if (root == null){
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root,subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
    public static void main(String[] args){
        int nodes1[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree1 = new BinaryTree();
        Node root = tree1.Buildtree(nodes1);
        tree1.preorder(root);


        System.out.println();
        BinaryTree.idx = -1;

        
        // int nodes2[]={2,4,-1,-1,5,-1,-1};
        int nodes2[]={3,-1,6,-1,-1};
        BinaryTree tree2 = new BinaryTree();
        Node subroot = tree2.Buildtree(nodes2);
        tree2.preorder(subroot);
        System.out.println(isSubtree(root, subroot));
        
    }
}