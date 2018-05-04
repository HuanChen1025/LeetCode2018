### java

与上一题不同的是，上一题可以对数组进行排序，然后依次查找。

#### 方法一：

采用 HashMap 实现，空间换取时间。

采用 哈希表实现并没有太大的难度，只是需要注意逻辑实现即可。

当一个数组中出现多个重复时，如果满足重复但是不满足索引差小于 k 的条件，应该更新 nums[i] 在 哈希表
中的索引值的索引值。

如果出现[1,0,1,1] 这样的情况，如果不更新索引值的化，会返回 false；

核心代码：

```java
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            //如果没有包含，将其put进去
            if (!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else {
                if (Math.abs(i-map.get(nums[i]))<=k)
                    return true;
                else {
                    map.put(nums[i],i);//更新索引
                }
            }
        }
```

#### 方法二：

利用 HashMap put 方法返回值的特性，可以写出更加简洁和快速的方法。

put 方法返回：
返回与 key 值关联的旧值，如果 key 没有任何映射关系，则返回 null。

该方法超过 91% 的 java 实现方法。

核心代码：
```java
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            Integer old = map.put(nums[i],i);//此处如果 map 中包含了 num[i],则写入新值，返回旧值，否者返回 null
            if (old != null && i-old <=k )
                return true;
        }
```














