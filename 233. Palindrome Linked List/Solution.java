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
                //У�����룬�˴�Ϊ����true ���� false ��Ҫ��ͨ���
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

        //������Ԫ��Ϊ������ʱ,��ָ��ָ����һ����Ҳ�������м�Ԫ��
        if (q !=null){
            p =p.next;
        }

        //�Ƚ������һ��Ԫ����ջ��Ԫ��
        while (stack.size() != 0 && p != null) {
            if (p.val != stack.pop()) {
                return false;
            }
            p = p.next;
        }
        return true;
    }
}