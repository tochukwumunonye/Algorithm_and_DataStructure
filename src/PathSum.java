public class Solution{
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        Stack<TreeNode> stack = new Stack();
        Stack<Integer> sum = new Stack();

        stack.add(root);
        sumstack.add(sum-root.val);

        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            int curr_sum = sumstack.pop;

            if (current.left == null && current.right == null && curr_sum ==0){
                return true;
            }

            if (current.left != null){
                stack.add(current.left);
                sumstack.add(curr_sum - current.left.val);

            }

            if (current.right != null){
                stack.add(current.right);
                sumstack.add(curr_sum - current.right.val);

            }
        }

        return false
    }
}
