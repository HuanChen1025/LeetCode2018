/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
                //校验输入，此处为空是true 还是 false 都要沟通清楚
        if (head == null)
            return true;


        ListNode p = head;
        ListNode q = head;

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (q!= null && q.next!=null){
            stack.push(p.val);
            p = p.next;
            q = q.next.next;
        }

        //当链表元素为奇数个时,慢指针指向下一个，也即是正中间元素
        if (q !=null){
            p =p.next;
        }

        //比较链表后一半元素与栈中元素
        while (stack.size() != 0 && p != null) {
            if (p.val != stack.pop()) {
                return false;
            }
            p = p.next;
        }
        return true;
    }
}