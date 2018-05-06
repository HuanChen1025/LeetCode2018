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
    public boolean isBalanced(TreeNode root) {
                return balabcedHelper(root) != -1;

    }
  private int balabcedHelper(TreeNode root){
        if (root == null)
            return 0;
        //后续遍历
        int left = balabcedHelper(root.left);
        if (left==-1) return -1;

        int right = balabcedHelper(root.right);
        if (right == -1) return -1;

        //如果差值大于1，返回-1，否者找出较大深度加上一并返回
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
}
}