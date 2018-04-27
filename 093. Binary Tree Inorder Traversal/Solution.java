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

    public List<Integer> inorderTraversal(TreeNode root) {
           //���Ϊ�գ����ؿյļ��ϣ��˴����ܷ��� null
        if (root == null)
            return new ArrayList<>();

        //���ؽ����
        List<Integer> results = new ArrayList<>();

        //�ѣ����ڱ�����
        Stack<TreeNode> stack = new Stack<>();

        //��ʱ��㣬���� root�����ܸı�ԭ��
        TreeNode p = root;

        while (p!=null || !stack.empty()){
            //�Ѹ��ڵ����������ѹ�뵽��ջ��
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            p = stack.peek();   //���ض�ջ�Ķ���������
            stack.pop();
            results.add(p.val);
            p=p.right;
        }
        return results;
    }
}