/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                if (l1 == null || l2 == null)
            return l1==null?l2:l1;

        ListNode list1 = l1;
        ListNode list2 = l2;

        ListNode result = new ListNode(0);

        ListNode head = result;

        int add =0; //add表示进位
        while (true){
            int sum  = list1.val + list2.val + add;

            head.val = sum%10;  //当前结点值

            add = sum/10;   //进位

            if (list1.next == null && list2.next == null){
                if (add != 0){
                    head.next = new ListNode(add);
                }
                break;
            }
            if (list1.next == null)
                list1.next = new ListNode(0);

            if (list2.next == null)
                list2.next = new ListNode(0);

            list1 = list1.next;

            list2 = list2.next;

            head.next = new ListNode(0);

            head = head.next;

        }
            return result;
    }
}