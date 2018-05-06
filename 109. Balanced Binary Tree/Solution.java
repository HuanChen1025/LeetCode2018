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
           if (root == null)
            return true;

        int left = getTreeDepth(root.left);
        int right = getTreeDepth(root.right);

        int diff = left-right;

        if (diff>1 || diff<-1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right); 
    }
     /**
     * 获取树的高度
     * 1）如果只有根结点，深度为1
     * 2）如果只有左子树，那么树的深度就应该是左子树加1.右子树同理
     * 3）如果左右子树都有，那么返回较大的一个加1
     * @param root
     * @return
     */
    private int getTreeDepth(TreeNode root){
        if (root == null)
            return 0;

        int left = getTreeDepth(root.left);
        int right = getTreeDepth(root.right);

        return left>=right ? left+1:right+1;
    }
}