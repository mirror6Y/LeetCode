package twopoint;

/**
 * @author mirror6
 * @description
 * @createTime 2020/7/27 17:22
 */
public class Code19 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p = head;
        ListNode q = head;
        while (n > 0) {
            q = q.next;
            n--;
        }

        while (q != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return p;
    }
}
