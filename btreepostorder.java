public class btreepostorder {
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
        root=new Node(10);
        root.left=new Node(1);
        root.right=new Node(14);
        root.left.left=new Node(17);
        root.left.right=new Node(15);
        root.right.left=new Node(13);
        root.right.right=new Node(11);
    }
    void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");

    }
    public static void main(String[] args) {
        btreepostorder po=new btreepostorder();
        po.createnode();
        System.out.println("Post order traversal of btree");
        po.postorder(po.root);

    }
}
