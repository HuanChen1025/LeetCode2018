### java

注意一个问题：每一个位置上的返回值是其左边元素之乘积 * 右边元素之乘积

如果能够将将每个位置左右两边的乘积计算出来，就会避免很多的重复计算。

此处采用一个 for 循环计算左边的乘积，采用另外一个 for 循环计算返回结果，以及更新 right 值

Thank @lycjava3 for this smart solution. To understand it easily, let me explain it with an example.
Given numbers [2, 3, 4, 5], regarding the third number 4, the product of array except 4 is 2*3*5 which consists of two parts:
left 2*3 and right 5. The product is left*right. We can get lefts and rights:

```
Numbers:     2    3    4     5
Lefts:            2  2*3 2*3*4
Rights:  3*4*5  4*5    5      
```
Let’s fill the empty with 1:
```
Numbers:     2    3    4     5
Lefts:       1    2  2*3 2*3*4
Rights:  3*4*5  4*5    5     1
```

We can calculate lefts and rights in 2 loops. The time complexity is O(n).
We store lefts in result array. If we allocate a new array for rights. The space complexity is O(n). 


参考：https://leetcode.com/problems/product-of-array-except-self/discuss/65622/Simple-Java-solution-in-O(n)-without-extra-space?page=3


