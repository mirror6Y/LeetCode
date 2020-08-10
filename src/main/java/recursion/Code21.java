package recursion;

import twopoint.ListNode;

/**
 * @author mirror6
 * @description 题目描述：
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 来源：力扣（LeetCode）
 * @example 示例:
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @createTime 2020/8/10 10:43
 */
public class Code21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(5);

        ListNode node2 = new ListNode(0);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(4);

        Code21 code21 = new Code21();
        ListNode res = code21.mergeTwoLists(node1, node2);
        System.out.println(res);

    }

}
