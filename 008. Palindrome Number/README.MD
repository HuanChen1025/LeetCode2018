### java
#### 方法1
将数字转化成字符在转换成 char 数组，然后两端往中间同时对比，发现不同返回 false。采用这个方法的时间复杂度不高，但是空间复杂度略大。

**核心代码：**
```java
char [] chars = String.valueOf(x).toCharArray();
int start = 0;
int end = chars.length-1;
while (start<end){
	if (chars[start] != chars[end]){
		return false;
	}
	else {
		start++;
		end--;
	}
}
```

#### 方法2
将数字转化为 StringBulider ，调用 它的 reverse 方法，对比反转前后是否相同。


#### 方法3
采取取模和除的方法，计算反转后的结果（注意反转结果应该使用 long 保存，防止溢出）。在这三种方法中，该方法的效率是最优的。

**核心代码：**
```java
int temp=x;long res=0;

while (temp!=0){
	res = res*10 + temp%10;
	temp /= 10;
}
```



