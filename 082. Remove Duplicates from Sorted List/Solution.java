/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
               if (head == null || head.next == null)
            return head;
        ListNode pHead = head;

        while (pHead.next != null){
            //此处的处理逻辑有问题
            if (pHead.val == pHead.next.val){
              ListNode temp = pHead.next.next;
              pHead.next = temp;
            }
            else {
                pHead = pHead.next;
            }

        }
        return head; 
    }
}