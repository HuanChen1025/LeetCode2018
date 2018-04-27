/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
                //校验输入是否为空
        if (root == null)
            return 0;

        int leftDepth = 0;
        int rightDepth = 0;
        //左子树的最大深度
        if (root.left != null){
             leftDepth = maxDepth(root.left);
        }

        //右子树的最大深度
        if (root.right != null){
             rightDepth = maxDepth(root.right);

        }
        return leftDepth>rightDepth?leftDepth+1:rightDepth+1;
    }
}