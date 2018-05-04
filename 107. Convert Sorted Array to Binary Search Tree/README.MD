### java
-----

因为数组是排序数组，比较简单，采用递归即可：
1）首先找到数组的中间值
2）从中间开始向两边递归生成二叉树
3)二叉树生成结果有多种，不局限

**核心代码**
```java
private static TreeNode arrayToBST(int nums[],int s,int e){
	if (s>e) return null;   //如果头指针大于尾指针，返回 null
	int mid =s+(e-s)/2;
	TreeNode node = new TreeNode(nums[mid]);

	node.left = arrayToBST(nums,s,mid-1);
	node.right = arrayToBST(nums,mid+1,e);

	return node;
}
```


