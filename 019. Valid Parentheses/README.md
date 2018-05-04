这道题简单的我不知道该说什么。

-----

- 知道啥是堆栈吗？
- 知道括号匹配应该用堆栈吗？
- 这道题需要超过五行吗？

不多说了，3 分钟没到， 需要注意的是括号别没对上。。。
### JAVA
#### 方法一

利用栈的特性：
用 hashMap 保存括号的左右对应关系做一个空栈，一个个的读入字符直到字符串结尾。如果一个字符是一个开放符号，则将其推入栈中。如果字符是一个封闭符号，则当栈空时报错；否者栈元素弹出，如果弹出不是对应的
开放符号，则报错。
最后，如果栈非空则报错

算法不是最优的

**核心代码**

```java
HashMap<Character,Character> map = new HashMap<>();
map.put('(',')');
map.put('[',']');
map.put('{','}');

Stack<Character> stack = new Stack();

for (int i=0;i<s.length();i++){
	char curr = s.charAt(i);

	if (map.keySet().contains(curr)){
		stack.push(curr);
	}
	else {
		//如果栈不为空，并且栈顶元素在 map 中的 value 与 curr 相等。
		if (!stack.empty() && map.get(stack.peek()) == curr){
			stack.pop();
		}
		else {
			return false;
		}
	}
}
```


#### 方法2
不再使用 hashMap ，但是依然是栈的思想，在遍历的过程中如果遍历到右括号，就将栈顶的元素弹出返回并对比。

**核心代码**
```java
for (char c :
		s.toCharArray()) {
	if (c == '('){
		stack.push(')');
	}
	else if (c == '['){
		stack.push(']');
	}
	else if (c == '{'){
		stack.push('}');
	}
	//输入的是右括号，如果栈为空或者栈顶元素不与当前元素相等，返回为 false
	else if (stack.isEmpty() || stack.pop() != c){
		return false;
	}
}
```