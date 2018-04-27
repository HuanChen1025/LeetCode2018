## Array

#### 118.Pascal's Triangle

该题只需要搞清除上下行的关系即可，并不难。

杨辉三角，给一个行数，输出杨辉三角，需要结合杨辉三角的性质。我们主要根据这条性质来产生结果：每个数字等于上一行的左右两个数字之和。可用此性质写出整个杨辉三角。即第n+1行的第i个数等于第n行的第i-1个数和第i个数之和。

核心代码

```java
    if (i>2){
        temp.add(1);
        //中间是需要计算的值
        List<Integer> list = result.get(i-2);
        for (int j=0;j<list.size()-1;j++){
            int sum = list.get(j) + list.get(j+1);
            temp.add(sum);
        }
        temp.add(1);
        result.add(temp);
    }
```

本题的 List 底层采用 ArrayList 更合适。