## 题目描述：
>给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
> 
> 来源：力扣（LeetCode）
  链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
  著作权归领扣网络所有。
### 栗子：

> 给定一个链表: 1->2->3->4->5, 和 n = 2.
>  
> 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 
 ### 说明：

> 给定的 n 保证是有效的。

### 进阶：

> 你能尝试使用一趟扫描实现吗？

## 思路：
本题考查的是你对链表的掌握程度，也是滑动窗口的题目。如果你面试中遇到过【返回链表中倒数第K个节点】，你就会发现这两个题目相似。结合下面的代码来看，就会容易的多。
首先来看下错误代码，也是我最开始的思路。我们不仅需要P和Q两个指针，还需要一个辅助指针。这是为什么呢？Q先移动到和P相隔N个节点的位置，然后继续移动，
直到指向NULL为止。这个时候P会指向要删除节点的前一个节点。然后使用 p.next = p.next.next;就可以删掉想删除的节点。但是本题需要返回
链表的头结点。所以P和Q都无法使用，于是我们用了辅助节点。

提交代码发现，删除头结点或者链表只有一个节点的时候，会出现bug。于是我们把辅助节点放在head节点前面，这样就可以避免了。

如果有什么错误或者问题，欢迎评论，我们一起探讨，一起进步。

## 代码：

### 错误：

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

### 正确：
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
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