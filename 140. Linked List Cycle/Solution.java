/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         if(head == null)
        return false;

        ListNode slowIndex = head;
        ListNode fastIndex =head;

        while (fastIndex!= null && fastIndex.next !=null){
            slowIndex = slowIndex.next;
            fastIndex =fastIndex.next.next; //�����ǰ�ڵ�������Ļ������ջ�ָ�� null

            if (slowIndex == fastIndex){
                return true;
            }
        }
        return false;   
    }
}