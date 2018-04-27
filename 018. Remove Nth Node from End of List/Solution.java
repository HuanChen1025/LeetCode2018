/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
                if (head == null)
            return head;

        ListNode myHead = new ListNode(0);
        myHead.next = head;
        ListNode p = myHead;
        ListNode q = myHead;

        // p ���� n ��
        while (n>0){
            p = p.next;
            n--;
        }
        // p ��q ָ��ͬʱ��
        while (p.next != null){
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;

        return myHead.next;
        
    }
}