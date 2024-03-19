package A67.Lab.BST;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-14-03
 */

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}


public class BSTree {
    Node root;

    public void insert(int val){
        root = insertRec(root, val);
    }

    public Node insertRec(Node root, int val){
        if(root == null){
            root = new Node(val);
        }else if(val < root.data){
           root.left = insertRec(root.left, val);
        }else{
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if(root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preOrder(){
        preOrderRec(root);
    }
    public void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){
        postOrderRec(root);
    }
    public void postOrderRec(Node root){
        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        BSTree tree = new BSTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);


        System.out.println("\nInorder: ");
        tree.inorder();
        System.out.println("\nPreorder: ");
        tree.preOrder();
        System.out.println("\nPostorder: ");
        tree.postOrder();
    }
}
