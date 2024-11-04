package BinaryTrees;
public class HeightTree {
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
            public int heightOfTree(Node root){
                if (root ==null){
                    return 0;
                }
                int lh = heightOfTree(root.left);
                int rh = heightOfTree(root.right);

                return Math.max(lh, rh) +1;
            }
            public int countNodes(Node root){
                if (root ==null){
                    return 0;
                }
                int lc = countNodes(root.left);
                int rc = countNodes(root.right);

                return lc + rc + 1;
            }
            public int sumNodes(Node root){
                if (root ==null){
                    return 0;
                }
                int ls = sumNodes(root.left);
                int rs = sumNodes(root.right);

                return ls + rs + root.data;
            }
        }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        int height = tree.heightOfTree(root);
        int noOfNodes = tree.countNodes(root);
        int sum = tree.sumNodes(root);
        System.out.println("The height of the tree is "+ height);
        System.out.println("the number of nodes " + noOfNodes);
        System.out.println("the sum of the nodes " + sum);

    }
}
