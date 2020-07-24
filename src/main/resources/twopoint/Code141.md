## 题目描述：
>给定一个链表，判断链表中是否有环。
> 
>为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
>
> 来源：力扣（LeetCode）
  链接：https://leetcode-cn.com/problems/linked-list-cycle/
  著作权归领扣网络所有。
### 栗子1：

> 输入：head = [3,2,0,-4], pos = 1
>
> 输出：true
>
> 解释：链表中有一个环，其尾部连接到第二个节点。
 
 ### 栗子2：
 
 > 输入：head = [1,2], pos = 0
 >
 > 输出：true
 >
 > 解释：链表中有一个环，其尾部连接到第一个节点。

 ### 栗子3：
 
 > 输入：head = [1], pos = -1
 >
 > 输出：false
 >
 > 解释：链表中没有环。

## 思路：
这是一道快慢指针题目，快指针每次走两步，慢指针每次走一步，如果二者最后相遇则说明有环，反之亦然。

如果有什么错误或者问题，欢迎评论，我们一起探讨，一起进步。

## 代码：
    public boolean hasCycle(ListNode head) {
        //0个或1个元素
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.val == slow.val) {
                return true;
            }
        }
        return false;
    }