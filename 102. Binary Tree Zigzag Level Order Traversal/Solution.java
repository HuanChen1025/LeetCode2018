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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
           List<List<Integer>> result = new ArrayList<List<Integer>>();

        Queue<TreeNode> queue = new ArrayDeque<>(); //���У����ڱ�����
        //У������
        if (root == null)
            return result;

        boolean flag = false;
        int count = 1;
        int levelCount = 0;
        //�����ڵ���ӵ�������
        queue.add(root);

        //ֻҪ���в�Ϊ��
        while (!queue.isEmpty()){
            List<Integer> levelResult = new ArrayList<>();
            while (count>0){
                TreeNode current = queue.poll();
                levelResult.add(current.val);
                if (current.left!= null){
                    queue.offer(current.left);//��ӵ�����
                    levelCount++;
                }
                if (current.right!=null){
                    queue.offer(current.right);
                    levelCount++;
                }
                count--;
            }
            if (flag == true){
                Collections.reverse(levelResult);
                result.add(levelResult);
                flag = false;
            }else {
                result.add(levelResult);
                flag = true;
            }

            count = levelCount; //��һ��Ľ��
            levelCount=0;   //��¼��һ��Ľ��

        }
        return result;
    }
}