package A67.FinalExam_Practice;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-16-03
 */
public class MyBinaryTree {
    static Node root;
    int size;
    MyBinaryTree(){
        size = 0;
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
        }
    }

    public void insert(int data){
        root = insertReccu(root, data);
    }

    private Node insertReccu(Node root, int data) {
        if(root == null){
            root =  new Node(data);
        }else if(root.data < data){
            root.right = insertReccu(root.right, data);
        }else{
            root.left = insertReccu(root.left, data);
        }
        return root;
    }

    private void inordeRecc(Node root) {
        if(root != null){
            inordeRecc(root.left);
            System.out.print(root.data+" ");
            inordeRecc(root.right);
        }
    }

    private void preordeRecc(Node root) {
        if(root != null){
            System.out.print(root.data+" ");
            preordeRecc(root.left);
            preordeRecc(root.right);
        }
    }

    private void postorderRecc(Node root) {
        if(root != null){
            postorderRecc(root.left);
            postorderRecc(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();
        tree.insert(15);
        tree.insert(9);
        tree.insert(15);
        tree.insert(12);
        tree.insert(7);
        tree.insert(25);
        tree.insert(10);

        System.out.println("\nInorder:");
        tree.inordeRecc(root);

        System.out.println("\nPreorder:");
        tree.preordeRecc(root);


        System.out.println("\nPostorder:");
        tree.postorderRecc(root);

    }
}
