package DAY3;
import java.util.*;

public class ITERATIVE_POSTORDER {


    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    static class Solution {

        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) return result;

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode curr = stack.pop();
                result.add(curr.val);

                if (curr.left != null){
                    stack.push(curr.left);

                }
                if(curr.right!=null){
                    stack.push(curr.right);
                }
            }
            Collections.reverse(result);
            return result;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();

        List<Integer> ans = sol.postorderTraversal(root);

        System.out.println(ans);
    }
}