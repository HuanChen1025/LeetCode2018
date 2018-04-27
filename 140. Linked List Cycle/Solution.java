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
            fastIndex =fastIndex.next.next; //如果当前节点数不足的话，最终会指向 null

            if (slowIndex == fastIndex){
                return true;
            }
        }
        return false;   
    }
}