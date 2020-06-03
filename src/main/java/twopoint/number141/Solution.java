package twopoint.number141;

/**
 * @author mirror6
 * @description simply<p>
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) 
 * in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 * <p>
 * @createTime 2020/5/27 9:54
 */
public class Solution {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public boolean hasCycle(ListNode head) {

        //0个或1个元素 没有环
        if (head == null || head.next == null) {
            return false;
        }
        ListNode p = head;
        ListNode q = head.next;

        while (p != q) {
            //q是快指针，每次走两步
            if (q == null || q.next == null) {
                return false;
            }
            p = p.next;
            q = q.next.next;
        }
        return true;
    }

}
