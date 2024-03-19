package A67.DataStructures.BinarySearchTree;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {25,12,36, 4, 15, 30, 45, 2, 10,13, 16, 29, 34, 40, 65};
        for(int a : arr){
            bst.insert(a);
        }
        System.out.println("Inorder:");
        bst.inOrderTraverse(bst.root);
        bst.deleleteNode(bst.root, 30);

        System.out.println("\npreorder:");
        bst.preOrderTraverse(bst.root);

        System.out.println("\npostorder:");
        bst.postOrderTraverse(bst.root);

        //bst.inOrderTraverse(bst.root);
    }
}