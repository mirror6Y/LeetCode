## 题目描述：
>给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
>
> 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/binary-search
 著作权归领扣网络所有。

### 栗子1：

>输入: nums = [-1,0,3,5,9,12], target = 9
>
>输出: 4
>
>解释: 9 出现在 nums 中并且下标为 4
 
### 栗子2：
 
>输入: nums = [-1,0,3,5,9,12], target = 2
>
>输出: -1
>
>解释: 2 不存在 nums 中因此返回 -1

## 提示：

你可以假设 nums 中的所有元素是不重复的。

n 将在 [1, 10000]之间。

nums 的每个元素都将在 [-9999, 9999]之间。

## 思路:
题目直接以二分查找命名，解题方案不言而喻。提示中说到所有元素不重复，所以最基本的二分查找就可以了。
可以选择递归的方式或非递归的方式。这里我选择了递归，如果你想换一种方式，可以思考如何去实现。

又到了老生常谈的问题了，二分查找需要注意的几个地方。1、查找的条件；2、mid的写法；3、mid+1和mid-1。

1、我们查找的区间是整个数组，下标0开始，下标nums.length - 1结束。这是我选择的边界，只要在这个闭区间[0，nums.length - 1]，即low<=high,就去执行程序。你可能会问为什么会有等于的情况？
把数字带进去就懂了[6,6]，这时候区间还有一个6需要比较；如果没有等号就是[6,6)，会直接把6漏掉。

2、mid=(low+high)/2;这种方式应该都会理解的，但是如果low和high比较大的话，两者之和就有可能会溢出。所以就有了改进，将mid的计算写成low+(high-low)/2。你以为这就结束了吗？并没有，还可以写成
mid=low+((high-low)>>1)。因为位运算要比除法更快，不过这样写一定要注意优先级。

3、low=mid+1，high=mid-1；这里有+1和-1，因为我们最先比较的就是索引为mid的元素，下次比较就不用再比较它了。而且如果直接写成 low=mid 或者 high=mid，可能会发生死循环。
比如，当 high=2，low=2 时，如果 a[2]不等于 target，就会导致一直循环不退出。

考虑了这些问题再写代码就会大大提高胜率了。你的代码可能和我的不一样，没关系，条条大路通罗马，而且每个人的想法都是不一样的。只要是对的就可以。

如果有什么错误或者问题，欢迎评论，我们一起探讨，一起进步。
## 代码：
    private int searchRecursive(int[] a, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        if (a[mid] == target) {
            return mid;
        } else if (a[mid] > target) {
            return searchRecursive(a, low, mid - 1, target);
        } else {
            return searchRecursive(a, mid + 1, high, target);
        }
    }

    public int search(int[] nums, int target) {
        return searchRecursive(nums, 0, nums.length - 1, target);
    }
