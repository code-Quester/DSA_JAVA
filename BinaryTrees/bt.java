package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;

public class bt {
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
        public void inorder(Node root){
            if (root ==null) {
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public void postorder(Node root){
            if (root ==null) {
                return ;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    q.add(null);
                }else{
                    System.out.print(currNode.data+" ");
                    
                    if (currNode.left!=null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }
            System.out.println();
        }
        public void levelOrder_Kthlevel(Node root, int k){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            int i = 1;
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode==null) {
                    i++;
                    if (q.isEmpty()) {
                        break;
                    }
                    q.add(null);
                }else{
                    if (i==k) {    
                        System.out.print(currNode.data+" ");
                    }
                    
                    if (currNode.left!=null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }
            System.out.println();
        }
        public void Kth_level(Node root, int i,int k){
            if (root == null) {
                return;
            }
            if (i==k) {
                System.out.print(root.data+ " ");
                return;
            }
            Kth_level(root.left, i+1,k);
            Kth_level(root.right, i+1,k);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.left.data);

        // System.out.println();      
        // tree.preorder(root);

        // System.out.println();
        // tree.inorder(root);

        // System.out.println();
        // tree.postorder(root);

        tree.levelOrder(root);
        System.out.println("the elements in the kth level ");
        // tree.levelOrder_Kthlevel(root, 3);

        tree.Kth_level(root, 1, 1);




    }
}
