package A67.Lab.BST;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-14-03
 */
public class BinarySearchTree {
    TreeNode root;
    static int count = 0;
    BinarySearchTree(){
        root = null;
    }
    public BinarySearchTree(int val) {
        root = new TreeNode(val,null, null);
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public void insert(int val){

        count++;

        if(root == null){
            root = new TreeNode(val,null,null);
        }else{
            insertRec(root, val);
        }
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if(root == null){
           return new TreeNode(val,null,null);
        }

        if(val < root.val){
            root.left = insertRec(root.left, val);
        }else{
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int target){
        if(root == null){ return null;}

        if(root.val == target){ return root;}

        if(target < root.val){
            root.left = search(root.left, target);
        }else {
            root.right = search(root.right, target);
        }
        return root;
    }

    public void inOrder(){
        inOrderTraversel(root);
    }

    public void inOrderTraversel(TreeNode root){
        if(root != null){
            inOrderTraversel(root.left);
            System.out.print(root.val+" ");
            inOrderTraversel(root.right);
        }
    }

    public void preOrderTraversel(TreeNode node){
        if(node != null){
            System.out.print(node.val+" ");
            preOrderTraversel(node.left);
            preOrderTraversel(node.right);
        }
    }

    public TreeNode deleteNode(TreeNode node, int deleteValue){
        if (node == null) return null;
        //if root is the target node to delete
        if(node.val == deleteValue){
            //if root->left is null, replace with root->right
            if(node.left == null){ return node.right;}
            if(node.right == null){ return node.left; }
            //If root has 2 children, replace with successor
            TreeNode p = findSuccessor(node);
            node.val = p.val;
            node.right = deleteNode(node.right, p.val);
            count--;
        }else if(node.val < deleteValue){   //find target in the right subtree
            node.right = deleteNode(node.right, deleteValue);
        }else{  //find target in the left subtree
            node.left = deleteNode(node.left, deleteValue);
        }
        return node;
    }

    public TreeNode findSuccessor(TreeNode node){
        TreeNode curr = node.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public void postOrderTraversel(TreeNode node){
        if(node != null){
            postOrderTraversel(node.left);
            postOrderTraversel(node.right);
            System.out.print(node.val+" ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
//        int arr[] = {45, 25, 65, 75, 15, 30, 55, 80, 10, 20, 50, 60};
//       for(int item: arr){
//            tree.insert(item);
//        }
        //int arr[] = {25,12,36,4,15,30,45,2,10,13,16,29,34,40,65};
        int arr[] = {50,10,150,8,30,100,152,5,9,26,31,79,126,151,180};
        for(int item: arr){
            tree.insert(item);
        }

        int target = 150;
        String result = tree.search(tree.root, target) != null ? "Found":"Not found";
        System.out.println(result);

        //2 4 10 12 13 15 16 25 29 30 34 36 40 45 65
        tree.deleteNode(tree.root, 50);
//       5 8 9 10 26 30 31 50 79 100 126 150 151 152 180

        System.out.println("Inorder:");
        tree.inOrderTraversel(tree.root);
//        tree.inOrder();

        System.out.println("\nPreorder:");
        tree.preOrderTraversel(tree.root);

        System.out.println("\nPostorder:");
        tree.postOrderTraversel(tree.root);

        System.out.println("\nNumber of Nodes: "+count);
    }
}
