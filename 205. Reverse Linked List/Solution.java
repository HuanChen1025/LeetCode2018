/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
                if (head == null)
            return head;
        Stack<Integer> stack = new Stack<>();

        ListNode myHeaad = new ListNode(0);
        myHeaad.next = head;

        ListNode first = myHeaad;
        ListNode second = myHeaad;


        while (first.next != null){
            stack.push(first.next.val);
            first = first.next;
        }

        while (second.next != null){
            second.next.val = stack.pop();
            second =second.next;
        }
        return myHeaad.next;
    }
}