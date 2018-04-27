/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
                if (head == null || head.next == null)
            return head;

        ListNode even = head.next;
        ListNode evenNext = even;
        ListNode oddNext =head;

        while (evenNext != null){
            oddNext.next = evenNext.next;
            if (oddNext.next != null){
                oddNext = oddNext.next;
                evenNext.next = oddNext.next;
                evenNext = evenNext.next;
            }else {
                break;
            }

        }
        oddNext.next = even;
        return head;
    }
}