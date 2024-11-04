package BinaryTrees;
public class diameterTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right =null;
        }
    }
    static class BinaryTree{
        static int idx= -1;
        public Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right =buildTree(nodes);

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
        public static int heightOfTree(Node root){
            if (root ==null){
                return 0;
            }
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);

            return Math.max(lh, rh) +1;
        }
        public static int diameter2(Node root){
            if (root ==null){
                return 0;
            }
            int ldiam = diameter2(root.left);
            int rdiam = diameter2(root.right);

            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);

            int selfDiam = lh + rh + 1;

            return Math.max(Math.max(ldiam ,rdiam), selfDiam);
        }
        static class Info{
            int diam;
            int ht;
            public Info(int diam, int height){
                this.diam = diam;
                this.ht= height;
            }
        }
        public static Info diameter(Node root){
            if (root ==null) {
                return new Info(0,0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int height = Math.max(leftInfo.ht, rightInfo.ht) +1;
            return new Info(diam, height);
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,6,-1,-1,-1,5,-1,7,8,-1,-1,-1,3,-1,-1};
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        tree.preorder(root);
        System.out.println();
        System.out.println("the diameter of the tree "+BinaryTree.diameter(root).diam);
    }
}
