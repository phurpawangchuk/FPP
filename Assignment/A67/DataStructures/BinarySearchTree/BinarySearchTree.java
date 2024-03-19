package A67.DataStructures.BinarySearchTree;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */

public class BinarySearchTree {
    TreeNode root;
    BinarySearchTree(){
        root = null;
    }
    BinarySearchTree(int val){
        root = new TreeNode(val);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;

        }
        public String toString(){
            return val + " ";
        }
    }

    public TreeNode search(TreeNode root, int target){
        if(root == null){
            return null;
        }

        if(target < root.val){
            return search(root.left, target);
        }
        return search(root.right, target);
    }

    public void insert(int val){
        if(root == null){
            root = new TreeNode(val);
        }else{
            insertRec(root, val);
        }
    }

    public TreeNode insertRec(TreeNode node, int val){
        if(node == null){
            return new TreeNode(val);
        }
        if(node.val < val){
            node.right = insertRec(node.right, val);
        }else{
            node.left = insertRec(node.left, val);
        }
        return node;
    }

    public void inOrderTraverse(TreeNode node){
        if(node == null) return;
        inOrderTraverse(node.left);
        System.out.print(node.val + " ");
        inOrderTraverse(node.right);
    }
    public void postOrderTraverse(TreeNode node){
        if(node == null) return;
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.val+" ");
    }
    public void preOrderTraverse(TreeNode node){
        if(node == null) return;
        System.out.print(node.val + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public TreeNode deleleteNode(TreeNode node, int key){
        //return null if root is null
        if(node == null){
            return node;
        }
        // delete current node
        // if root is the target node
        if(node.val == key){
            //replace root with root -> right
            //if root -> left is null
            if(node.left == null){
                return node.right;
            }
            //replace root with root -> left
            // if root-> right is nulll
            if(node.right == null){
                return node.left;
            }
            // replace root with its successor
            // if root has two children
            TreeNode p = findSuccessor(node);
            node.val = p.val;
            node.right = deleleteNode(node.right, p.val);
            return node;
        }
        if(node.val < key){
            // find target in right subtree
            // if root -> val < key
            node.right = deleleteNode(node.right, key);
        }else{
            //find target in left subtree
            //if root => val < key
            node.left = deleleteNode(node.left, key);
        }
        return node;
    }

    private TreeNode findSuccessor(TreeNode node) {
        TreeNode  curr = node.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public String toString(){
        return "BinarySearchTree{"+"root="+ root.val+"}";
    }
}