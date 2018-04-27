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
        List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
                if (root==null || k<=0){
            return 0;
        }
        preOrder(root);

        return list.get(k-1);
    }
     private void preOrder(TreeNode root){
        if (root == null)
            return;
        if (root.left != null)
            preOrder(root.left);
        //ֵ
        list.add(root.val);
        if (root.right!= null)
            preOrder(root.right);

    }
}