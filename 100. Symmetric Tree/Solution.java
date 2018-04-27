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
    public boolean isSymmetric(TreeNode root) {
                //У������
        if (root == null)
            return true;

        return twoTreeSymmetric(root.left,root.right);
    }
    
        /**
     * �ж��������Ƿ��ǶԳƵ�
     * @param p
     * @param q
     * @return
     */
    private boolean  twoTreeSymmetric(TreeNode p,TreeNode q){
        if (p == null && q==null)
            return true;

        //���������ܷŵ���һ������֮ǰ
        if (p == null || q == null){
            return false;
        }
        boolean flag = false;
        if (p.val == q.val){
          flag =  twoTreeSymmetric(p.left,q.right) && twoTreeSymmetric(p.right,q.left);
        }
        return flag;
    }
}