public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root){
        if( root == null){
            return null
        }

        TreeNode left = invertTree(root.left);
        TreeNode left = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;

    }
}
