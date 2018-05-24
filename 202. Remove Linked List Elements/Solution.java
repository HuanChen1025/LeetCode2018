/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 class Solution {
    public ListNode removeElements(ListNode head, int val) {
      if (head == null)
            return null;

        ListNode helper = new ListNode(0);
        helper.next  = head;

        ListNode pHead =  helper;

        while (pHead.next != null){
            //此处的逻辑有待修改
            if (pHead.next.val == val){//如果相等，需要跳过这个
                pHead.next = pHead.next.next;
            }
            else {
                pHead = pHead.next;
            }

        }
        return helper.next;  
    }
}