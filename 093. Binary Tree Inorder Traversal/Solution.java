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
           //如果为空，返回空的集合，此处不能返回 null
        if (root == null)
            return new ArrayList<>();

        //返回结果集
        List<Integer> results = new ArrayList<>();

        //堆，用于保存结点
        Stack<TreeNode> stack = new Stack<>();

        //临时结点，代替 root，不能改变原树
        TreeNode p = root;

        while (p!=null || !stack.empty()){
            //把根节点的所有左结点压入到堆栈中
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            p = stack.peek();   //返回堆栈的顶，不弹出
            stack.pop();
            results.add(p.val);
            p=p.right;
        }
        return results;
    }
}