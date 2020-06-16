package interview;

/**
 * @author mirror6
 * @description 链表倒数第K个元素
 * @createTime 2020/6/8 17:09
 */
public class ReciprocalK {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head != null) {
            ListNode l = head;
            ListNode r = head;
            while (r != null && 0 < k) {
                r = r.next;
                k--;
            }

            while (r != null) {
                r = r.next;
                l = l.next;
            }
            return l;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ReciprocalK reciprocalK = new ReciprocalK();
        reciprocalK.getKthFromEnd(node, 2);
    }
}
