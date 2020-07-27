package twopoint;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author mirror6
 * @description 题目描述：
 * 编写一个程序，找到两个单链表相交的起始节点。
 * @createTime 2020/7/27 9:34
 */
public class Code160 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //哈希
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }

        return null;
    }
}