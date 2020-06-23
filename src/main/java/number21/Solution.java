package number21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author mirror6
 * @description
 * @createTime 2020/6/11 16:27
 */
public class Solution {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        List list1 = new ArrayList();
        List list2 = new ArrayList();

        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }

        List end = new ArrayList();
        end.addAll(list1);
        end.addAll(list2);

        int[] a = new int[end.size()];
        for (int i = 0; i < end.size(); i++) {
            a[i] = (int) end.get(i);
        }
        Arrays.sort(a);

        ListNode node = new ListNode(a[0]);
        for (int i = 1; i < a.length; i++) {
            node.next = new ListNode(a[i]);
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        solution.mergeTwoLists(l1, l2);
    }
}
