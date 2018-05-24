### java

如果只是判断能否跳到终点，我们只要在遍历数组的过程中，
更新每个点能跳到最远的范围就行了，如果最后这个范围大于等于终点，就是可以跳到

遍历数组，采用贪心算法更新能够到达的最远位置，核心代码：


```java
	int len = nums.length;

	int reach =0, i=0;

	for ( i=0;i<=reach && i<len;i++){
		//贪心算法，更新能够到达的最远点，
		reach = Math.max(reach,nums[i]+i);
	}
	return i == len;
```