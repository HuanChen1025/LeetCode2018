### java
-----
### 二叉树层次遍历的循环实现

#### 方法1 

二叉树层次遍历的变形，只需要在最后将返回的链表进行反转即可。

层次遍历过程中采用一个队列保存下一层的结点，并且在遍历当前层的结点时，记录下一层的结点个数。

#### 方法2（来源discuss）

采用 深度优先搜索（DFS）
其实整体上方法和我的层次遍历差不多，但是更加的简洁易懂。

**核心代码**
```java
   Queue<TreeNode> queue = new LinkedList<>();
	List<List<Integer>> res = new LinkedList<>();

	if (root == null) return res;

	queue.offer(root);

	while (!queue.isEmpty()){
		int levelNum = queue.size();
		List<Integer> subList = new LinkedList<>();//用于临时存储
		for (int i=0;i<levelNum;i++){
			if (queue.peek().left != null) queue.offer(queue.peek().left);
			if (queue.peek().right != null) queue.offer(queue.peek().right);
			subList.add(queue.poll().val);
		}
		//每次都在索引为 0 的位置插入，最后的结果就是反转的结果
		res.add(0,subList);
	}
```

因为使用了 res.add(0,subList); 所以在 res 链表的底层使用 LinkedList 是最佳的。避免了数组方法插入时元素的移动。



