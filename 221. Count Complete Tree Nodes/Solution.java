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
    
        private int mostLeftLevel(TreeNode root){
        if (root == null)
            return 0;
        return mostLeftLevel(root.left)+1;
    }
    
    public int countNodes(TreeNode root) {
           if(root == null)
            return 0;

        int left = mostLeftLevel(root.left);
        int right = mostLeftLevel(root.right);

        if (left == right){
            //������������
            return (1<<left)+countNodes(root.right);
        }
        else{
           // right < left �����������ģ��Ҳ�����һ��
            return (1<<right) + countNodes(root.left);
        }   
    }
}