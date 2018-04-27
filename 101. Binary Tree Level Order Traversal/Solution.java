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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();

        Queue<TreeNode> queue = new ArrayDeque<>(); //队列，用于保存结点
        //校验输入
        if (root == null)
            return result;

        boolean flag = true;
        int count = 1;
        int levelCount = 0;
        //将根节点添加到队列中
        queue.add(root);

        //只要队列不为空
        while (!queue.isEmpty()){

            List<Integer> levelResult = new ArrayList<>();
            while (count>0){
                TreeNode current = queue.poll();
                levelResult.add(current.val);
                    if (current.left!= null){
                        queue.offer(current.left);//添加到队列
                        levelCount++;
                    }
                    if (current.right!=null){
                        queue.offer(current.right);
                        levelCount++;
                    }
                count--;
            }
            result.add(levelResult);
            count = levelCount; //这一层的结点
            levelCount=0;   //记录下一层的结点

        }

        return result;
    }
}