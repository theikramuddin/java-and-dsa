public class DiameterTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameterTree2(Node root) { //O(n2)
        if (root == null) {
            return 0;
        }

        int lDia = diameterTree2(root.left);
        int rDia = diameterTree2(root.right);
        int lHei = height(root.left);
        int rHei = height(root.right);
        int selfDia =  lHei + rHei + 1;
        return Math.max(Math.max(lDia, rDia), selfDia);
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameterTree(Node root) { //O(n)
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameterTree(root.left);
        Info rightInfo = diameterTree(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.min(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        

        System.out.println("Diameter of the Tree is: "+diameterTree(root).ht);
        
    }
}
