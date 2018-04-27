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

        Queue<TreeLinkNode> queue = new ArrayDeque<>(); //���У����ڱ�����

        int count = 1;
        int levelCount = 0;
        //�����ڵ���ӵ�������
        queue.add(root);
        root.next = null;//���ڵ�� next ���Ϊ null

        //ֻҪ���в�Ϊ��
        while (!queue.isEmpty()){
            TreeLinkNode currentNode = null;
            TreeLinkNode nextNode = null;
            while (count>0){
                 currentNode = queue.poll();
                 if (count == 1){
                     nextNode = null;   //����Ǹò�����һ����㣬�ͻ����ָ����һ��ĵ�һ�����
                 }else
                     nextNode = queue.peek();

                currentNode.next = nextNode;
                if (currentNode.left != null){
                    queue.offer(currentNode.left);//��ӵ�����
                    levelCount++;
                }
                if (currentNode.right!=null){
                    queue.offer(currentNode.right);
                    levelCount++;
                }
                count--;
            }


            count = levelCount; //��һ��Ľ��
            levelCount=0;   //��¼��һ��Ľ��
        }
    }
}