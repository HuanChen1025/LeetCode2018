## 思路(java)

本题很简单，主要需要搞明白从第 3 行开始需要上一行参与计算求出本行的中间值

核心代码如下：
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

## 复杂度

时间复杂度为 O(N),空间复杂度为O(N),需要存储结果