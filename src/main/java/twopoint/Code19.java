package twopoint;

/**
 * @author mirror6
 * @description 题目描述：
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 栗子：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
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
        if (head == null || head.next == null) {
            return null;
        }
        ListNode r = head;
        ListNode p = r;
        ListNode q = r;

        while (n >= 0 && q != null) {
            q = q.next;
            n--;
        }

        while (q != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return r;
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // 两个指针之间相隔n个结点
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }


    public static void main(String[] args) {
        Code19 code19 = new Code19();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        code19.removeNthFromEnd(node, 2);
    }
}
