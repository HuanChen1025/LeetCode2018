/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null)
            return;

        Queue<TreeLinkNode> queue = new ArrayDeque<>(); //队列，用于保存结点

        int count = 1;
        int levelCount = 0;
        //将根节点添加到队列中
        queue.add(root);
        root.next = null;//根节点的 next 结点为 null

        //只要队列不为空
        while (!queue.isEmpty()){
            TreeLinkNode currentNode = null;
            TreeLinkNode nextNode = null;
            while (count>0){
                 currentNode = queue.poll();
                 if (count == 1){
                     nextNode = null;   //如果是该层的最后一个结点，就会把它指向下一层的第一个结点
                 }else
                     nextNode = queue.peek();

                currentNode.next = nextNode;
                if (currentNode.left != null){
                    queue.offer(currentNode.left);//添加到队列
                    levelCount++;
                }
                if (currentNode.right!=null){
                    queue.offer(currentNode.right);
                    levelCount++;
                }
                count--;
            }


            count = levelCount; //这一层的结点
            levelCount=0;   //记录下一层的结点
        }
    }
}