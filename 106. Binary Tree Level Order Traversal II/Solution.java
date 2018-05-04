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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        //构建一个队列，用于存储下一层结点
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int levelNum = 1;
        int curNum =0;
        while (!queue.isEmpty()){
            List<Integer> tempRes = new ArrayList<>();//保存每一层的结点

            while (levelNum>0){
                TreeNode temp = queue.poll();
                tempRes.add(temp.val);
                if (temp.left != null){
                    queue.add(temp.left);
                    curNum++;
                }
                if (temp.right != null){
                    queue.add(temp.right);
                    curNum++;
                }
                levelNum--;
            }
            levelNum = curNum;  //将下一层的结点个数赋值给 levelNum
            curNum = 0;//将下一层的计数指针置为0
            res.add(tempRes);   //将结果添加到返回链表中
        }
        //需要对 res 进行反转

        Collections.reverse(res);


        return res;
    }
	
	    /**
     * DFS solution
     * 深度优先搜索
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrderBottom_02(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();

        if (root == null) return res;

        queue.offer(root);

        while (!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();//用于临时存储
            for (int i=0;i<levelNum;i++){
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            //每次都在索引为 0 的位置插入，最后的结果就是反转的结果
            res.add(0,subList);
        }
        return res;
    }
}