### java
-----

这道题的解决方案很多，可以采用双指针、也可以采用回溯法和动态规划

#### 方法1：

来源：https://leetcode.com/problems/longest-palindromic-substring/discuss/2928/Very-simple-clean-java-solution?page=3

针对字符串中的一个字符，两种情况：
- 回文字符串长度为奇数，从中间的数字向两边查找，直到两端不相等或者指针越界
- 回文字符串长度为偶数，从中间的两个数字向中间查找，直到两端不相等或者指针越界

算法的时间复杂度为 O（N logN）

最坏的时间复杂度：

当输入字符串类似 “aaaaaaa”，全部都是一个元素时，算法的时间复杂度最差，为O（N^2)

