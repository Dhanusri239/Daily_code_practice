public class btreepreorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    void createnode(){
        root=new Node(6);
        root.left=new Node(5);
        root.right=new Node(7);
        root.left.left=new Node(8);
        root.left.right=new Node(10);
        root.right.left=new Node(9);
        root.right.right=new Node(11);
    }
    void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String[] args) {
        btreepreorder pd=new btreepreorder();
        pd.createnode();
        System.out.println("Preorder traversal of btree");
        pd.preorder(pd.root);

    }
}
