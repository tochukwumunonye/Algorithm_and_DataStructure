public class InOrderTransversal {
    public List <Integer> inOrderTransversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack();
        List<Integer> output_arr = new ArrayList<>();

        if(root == null){
            return output_arr;
        }

        TreeNode current = root;

        while (current != null || !stack.isEmpty()){
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            output_arr.add(current.val);

            current = current.right;
            

        }
        return output_arr;
    }
}
