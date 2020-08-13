package linkedlist;

import twopoint.ListNode;

/**
 * @author mirror6
 * @description
 * @createTime 2020/8/11 15:20
 */
public class Code61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        } else if (head.next == null || k == 0) {
            return head;
        }
        //计算链表节点个数并成环
        ListNode node = head;
        int n;
        for (n = 1; node.next != null; n++) {
            node = node.next;
        }
        node.next = head;

        ListNode res = head;
        //找新的尾结点
        //注意！！！！  k%n这个
        n = n - 1 - k % n;
        for (int i = 0; i < n; i++) {
            res = res.next;
        }
        ListNode newHead = res.next;
        //新的尾节点
        res.next = null;
        return newHead;
    }


    //双指针
    public ListNode rotateRight2(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }

        ListNode p = head;
        ListNode q = head;
        ListNode r = head;
        int count = 0;
        while (r != null) {
            r = r.next;
            count++;
        }
        int swap = k > count ? k % count : k;
        if (count == 1 || swap == 0) {
            return head;
        }
        while (swap > 0) {
            q = q.next;
            swap--;
        }
        while (q != null) {
            q = q.next;
            p = p.next;
        }
        //count
        int num = 0;
        ListNode c = p;
        while (c != null) {
            c = c.next;
            num++;
        }
        ListNode res = p;
        while (p != null && p.next != null) {
            p = p.next;
        }
        k = count - num;

        while (p != null && k > 0) {
            p.next = new ListNode(head.val);
            p = p.next;
            head = head.next;
            k--;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        Code61 code61 = new Code61();
        code61.rotateRight(node, 2);
    }
}
