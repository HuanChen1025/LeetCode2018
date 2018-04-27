/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
                if (headA == null || headB == null)
            return null;

        int longList  = listLength(headA);
        int shortList = listLength(headB);
        ListNode longListNode = headA;
        ListNode shortListNode = headB;


        int diff = longList - shortList;

        if (diff<0){
            longListNode = headB;
            shortListNode = headA;
            diff = Math.abs(diff);
        }

        while (diff>0){
            longListNode = longListNode.next;
            diff--;
        }

        while (longListNode != null && shortListNode != null && (longListNode != shortListNode)){
            longListNode = longListNode.next;
            shortListNode = shortListNode.next;
        }

        return longListNode;
    }
    
        private int listLength(ListNode head){
        if (head == null)
            return 0;
        int result =1;

        if (head.next == null)
            return result;

        while (head.next != null){
            result++;
            head = head.next;
        }
        return result;
    }
}