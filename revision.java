import java.util.*;

/**
 * revision
 */
public class revision {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode =  new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root,int k){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        int i =1;
        while (!q.isEmpty()) {
            Node ele = q.remove();
            if (ele == null) {
                // System.out.println();
                i++;
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
            }
            else{
                if (k==i) {
                    
                    System.out.print(ele.data+" ");
                }
                else{
                    if (ele.left !=null) {
                        q.add(ele.left);
                    }
                    if (ele.right != null) {
                        q.add(ele.right);
                    }
                }
            }
        }
        System.out.println();
    }

    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh) +1;
    }
    public static int count (Node root){
        if (root ==null) {
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        return lc + rc + 1;
    }
    public static int findDiameter(Node root){
        if (root == null) {
            return 0;
        }
        int leftDiam = findDiameter(root.left);
        int rightDiam = findDiameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(Math.max(leftDiam,rightDiam),lh+rh+1);
    }

    static class Info{
        int diam;
        int height;
        public Info(int diam,int height){
            this.diam = diam;
            this.height = height;
        } 
    }
    public static Info diameter(Node root){
        if (root == null) {
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height,rightInfo.height) +1;
        return new Info(diam, height);
    }
    public static boolean isIdentical(Node root, Node subroot){
        if (root == null && subroot == null) {
            return true;
        }
        if (root == null || subroot == null || root.data!=subroot.data) {
            return false;
        }
        return isIdentical(root.left,subroot.left) && isIdentical(root.right,subroot.right);
    }
    public static boolean subtree(Node root, Node subroot){
        if (root == null) {
            return false;
        }
        
        // find the subroot in the main tree
        if (root.data == subroot.data) {
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return subtree(root.left, subroot) || subtree(root.right, subroot);
        
    }
    static class Info1{
        int hd;
        Node node;
        public Info1(Node node,int hd){
            this.hd = hd;
            this.node= node;
        }
    }
    public static void topview(Node root){
        Queue<Info1> q = new LinkedList<>();
        int min=0,max=0;
        HashMap<Integer,Node> map= new HashMap<>();
        q.add(new Info1(root,0));
        q.add(null);
        while (!q.isEmpty()) {
            Info1 curr = q.remove();
            if (curr ==null) {
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
            }
            else{
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd,curr.node);
                }
                if (curr.node.left!=null) {
                    q.add(new Info1(curr.node.left, curr.hd -1));
                    min = Math.min(min,curr.hd-1);
                }
                if (curr.node.right!=null) {
                    q.add(new Info1(curr.node.right, curr.hd +1));
                    max = Math.max(max,curr.hd+1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data +" ");
        }
        System.out.println();
    }
    public static void kthlevel(Node root, int k,int i){
        if (root == null) {
            return;
        }
        if (i==k) {
            System.out.print(root.data +" ");
            return;
        }
        kthlevel(root.left, k, i+1);
        kthlevel(root.right, k, i+1);
    }
    public static boolean getPath(Node root, int d, ArrayList<Node> path){
        if (root== null) {
            return false;
        }
        path.add(root);
        if (root.data == d) {
            return true;
        }
        if (!getPath(root.left, d, path) && !getPath(root.right, d, path)) {
            path.remove(path.size()-1);
            return false;
        }else{
            return true;
        }
    }
    public static Node lca1(Node root, int d1, int d2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, d1, path1);
        getPath(root, d2, path2);
        int i=0;
        while (path1.get(i).data == path2.get(i).data) {
            i++;
        }
        return path1.get(i-1);
    }
    public static Node lca2(Node root, int d1, int d2){
        if (root == null) {
            return null;
        }
        if (root.data == d1 || root.data ==d2) {
            return root;
        }
        Node leftlca = lca2(root.left, d1, d2);
        Node rightlca = lca2(root.right, d1, d2);

        if (leftlca==null) {
            return rightlca;
        }else if (rightlca ==null) {
            return leftlca;
        }
        return root;
    }
    public static int findDist(Node root, int d){
        if (root==null) {
            return -1;
        }
        if (root.data == d) {
            return 0;
        }
        int ld= findDist(root.left, d);
        int rd = findDist(root.right, d);

        if (ld==-1 && rd==-1) {
            return -1;
        }else if(ld==-1){
            return rd+1;

        }else{
            return ld+1;
        }
    }
    public static int minDist(Node root, int d1, int d2){
        Node lca = lca1(root, d1, d2);

        int dist1= findDist(lca, d1);
        int dist2= findDist(lca, d2);
        return dist1+dist2;
    }
    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes1[] = {2,4,-1,-1,5,-1,-1};
        // int nodes[]={1,2,4,6,-1,-1,-1,5,-1,7,8,-1,-1,-1,3,-1,-1};
        BinaryTree tree =  new BinaryTree();
        // BinaryTree tree1 = new BinaryTree();
        Node root = tree.buildTree(nodes);
        preorder(root);
        // BinaryTree.idx=-1;
        System.out.println();
        // Node subroot = tree.buildTree(nodes1);
        // preorder(subroot);

        // System.out.println(subtree(root,subroot));
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);
        // System.out.println();
        // levelOrder(root,1);
        // System.out.println("height "+ height(root));
        // System.out.println("count "+ count(root));
        // System.out.println("Diameter => " + findDiameter(root));
        // System.out.println("Diameter => " + diameter(root).diam);
    //     topview(root);
    //     int k=1;
    //     kthlevel(root,k,1);

        // System.out.println(lca1(root, 4, 3));

        //minimum distance between 4 and 6
        int dist = minDist(root, 2, 6);
        System.out.println(dist);

        System.out.println(lca2(root, 3 , 6).data);

    }
}