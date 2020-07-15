## 题目描述：
>编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
> 
> 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/zero-matrix-lcci/
 著作权归领扣网络所有。

### 栗子1：

> 输入：
  [
    [1,1,1],
    [1,0,1],
    [1,1,1]
  ]
  输出：
  [
    [1,0,1],
    [0,0,0],
    [1,0,1]
  ]

 
### 栗子2：
 
>输入：
 [
   [0,1,2,0],
   [3,4,5,2],
   [1,3,1,5]
 ]
 输出：
 [
   [0,0,0,0],
   [0,4,5,0],
   [0,3,1,0]
 ]

## 思路:

先去遍历数组，找到0的下标，然后放到集合中。然后分别0所在的行和列进行置零处理。

如果有什么错误或者问题，欢迎评论，我们一起探讨，一起进步。
## 代码：
    public void setZeroes(int[][] matrix) {

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (0 == matrix[i][j]) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (Integer row : rows) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }

        for (Integer col : cols) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col] = 0;
            }
        }

    }
