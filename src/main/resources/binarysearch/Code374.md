## 题目描述：
>我们正在玩一个猜数字游戏。 游戏规则如下：
>我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
>每次你猜错了，我会告诉你这个数字是大了还是小了。
>你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
>
>来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/guess-number-higher-or-lower
著作权归领扣网络所有。
 
`-1 : 我的数字比较小
  1 : 我的数字比较大
  0 : 恭喜！你猜对了！`

### 栗子1：

> 输入: n = 10, pick = 6
>
> 输出: 6

## 思路:
一道基础的二分查找，只需要注意边界、mid中间值等细节即可。

如果有什么错误或者问题，欢迎评论，我们一起探讨，一起进步。
## 代码：
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
