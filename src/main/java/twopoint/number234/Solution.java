package twopoint.number234;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/3 14:22
 */


public class Solution {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {

        List list = new LinkedList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = (int) list.get(i);
        }

        int p = 0;
        int q = array.length - 1;

        while (p <= q) {
            if (array[p] == array[q]) {
                p++;
                q--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);
        solution.isPalindrome(listNode);
    }
}
