import java.util.*;
public class inprepobyscanner {
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
    Node buildtree(Scanner sc,String pos){
        System.out.println("Enter data for " + pos + " ( -1 for  no node)");                                                                                                                                                                                                                
        int val=sc.nextInt();
        if(val==-1){
            return null;
        }
        Node newNode=new Node(val);
        newNode.left=buildtree(sc,"left child of "+val);
        newNode.right=buildtree(sc,"right child of "+val);
        return newNode;
    }
    void preorder(Node node){
        if(node==null){
            return;
        }
           System.out.print(node.data+ " ");
           preorder(node.left);
           preorder(node.right);
    }
    void inorder(Node node){
         if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
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
        Scanner sc=new Scanner(System.in);
        inprepobyscanner ipp=new inprepobyscanner();
        ipp.root=ipp.buildtree(sc,"root");
        System.out.println("The preorder,inorder,postorder of btree are ");
        ipp.preorder(ipp.root);
        System.out.println();
        ipp.inorder(ipp.root);
        System.out.println();
        ipp.postorder(ipp.root);
    }
}
