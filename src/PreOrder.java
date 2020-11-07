public class Solution {

    public List<Integer> preorderTransversal(Node root){
        LinkList<Node> stack = new LinkList<>();
        LinkedList<Integer> output_arr = new LinkedList<>();

        if (root == null){
            return output_arr;
        }

        stack.add(root);
        while(!isEmpty()) {
            Node node = stack.pollLast();
            output_arr.add(node.val){
                Collection.reverse(node.children);
                for(Node child : node.children){
                    stack.add(child)
                }
            }

            return output_arr;
        }
    }
}
