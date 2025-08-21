public class btreeinorder {
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
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
     }
     void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data+" ");
        inorder(node.right);
     }
     public static void main(String[]args){
        btreeinorder bn=new btreeinorder();
        bn.createnode();
        System.out.println("Inorder traversal of btree is ");
        bn.inorder(bn.root);

     }
}
