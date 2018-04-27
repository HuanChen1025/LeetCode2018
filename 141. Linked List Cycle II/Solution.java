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
    public ListNode detectCycle(ListNode head) {
              if (head == null || head.next ==null)
            return null;

        ListNode slowIndex = head;
        ListNode fastIndex = head;

        while (fastIndex != null && fastIndex.next != null){
            slowIndex =slowIndex.next;
            fastIndex =fastIndex.next.next;

            if (slowIndex == fastIndex){
                slowIndex = head;

                while (slowIndex != fastIndex){
                    slowIndex = slowIndex.next;
                    fastIndex =fastIndex.next;
                }
                return slowIndex;
            }
        }
        return null;  
    }
}