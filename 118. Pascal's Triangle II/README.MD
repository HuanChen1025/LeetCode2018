### java

和上一题的区别是，上一题需要输出完整的杨辉三角，本题只需要输出对应的一行即可，主要是要在迭代计算的
过程中计算得出下一行的结果。

题目思路比较简单

优化的地方为减少空间复杂度。

核心代码如下：
```java
        for (int i=0;i<=rowIndex;i++){
            if (i==0 || i==1){
                result.add(1);
            }
            //建立临时链表，存放下一行的结果
            List<Integer> tem = new ArrayList<>();

            if (i>=2){
                tem.add(1);
                for (int j=0;j<result.size()-1;j++){
                    tem.add(result.get(j)+result.get(j+1));
                }
                tem.add(1);
                //将结果给 result
                result = tem;
            }
        }

```
