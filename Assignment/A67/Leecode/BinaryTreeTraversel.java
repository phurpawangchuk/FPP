package A67.Leecode;

import java.util.ArrayList;
import java.util.List;


/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */
public class BinaryTreeTraversel {
    static TreeNode root;
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(){}
        TreeNode(int val){ data = val;}
        TreeNode(int data, TreeNode left, TreeNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static public void insert(int data){
        root = insertRec(root, data);
    }

    static public TreeNode insertRec(TreeNode root,int  data) {
        if(root == null){
            root = new TreeNode(data);
        }else if( data < root.data) {
            root.left = insertRec(root.left, data);
        }else{
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public List<Integer> inorder(TreeNode node){
        List<Integer> list = new ArrayList<>();
        list = inorderRec(list, node);
        return list;
    }

    static public List<Integer> inorderRec(List<Integer> list, TreeNode node) {
        if(node != null) {
            list.add(node.data);
            inorderRec(list, node.left);
            inorderRec(list, node.right);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        insert(1);
        insert(3);
        insert(21);
        insert(9);
        insert(11);
        insert(8);

        List<Integer> list = inorderRec(new ArrayList<>(), root);
        System.out.println(list);

    }
}
