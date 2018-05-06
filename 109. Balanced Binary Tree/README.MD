### java

#### 方法1
该方法比较low ，如果是在面试中，面试官对这个方法肯定是不会满意的，因为重复遍历太多，时间消耗严重。

1) 求取任意一颗树的深度

- 如果只有根结点，深度为1
- 如果只有左子树，那么树的深度就应该是左子树加1.右子树同理
- 如果左右子树都有，那么返回较大的一个加1
**核心代码** 

采用递归求解：

```java
 private int getTreeDepth(TreeNode root){
	if (root == null)
		return 0;

	int left = getTreeDepth(root.left);
	int right = getTreeDepth(root.right);

	return left>=right ? left+1:right+1;
    }
```

2） 遍历二叉树结点，遍历的同时取得每个结点左右子节点的高度，并判断。
**核心代码：**

```java
 public boolean isBalanced_01(TreeNode root) {
	if (root == null)
		return true;

	int left = getTreeDepth(root.left);
	int right = getTreeDepth(root.right);

	int diff = left-right;

	if (diff>1 || diff<-1)
		return false;

	return isBalanced_01(root.left) && isBalanced_01(root.right);
    }
```

### 方法2

采用后续遍历的方式，从下往上遍历。遍历的最后一次是根节点的左右子树对比，如果任然满足，则返回为 true；

改为从下往上遍历，如果子树是平衡二叉树，则返回子树的高度；如果发现子树不是平衡二叉树，则直接停止遍历，这样至多只对每个结点访问一次。

并且当左子树的高度为 -1 时，就没有必要去求右子树的高度了。

**核心代码**

```java
	/**
     * 为了避免重复遍历，采用后序遍历的方式
     * @param root
     * @return
     */
    private int balabcedHelper(TreeNode root){
        if (root == null)
            return 0;
        //后续遍历
        int left = balabcedHelper(root.left);
        if (left==-1) return -1;

        int right = balabcedHelper(root.right);
        if (right == -1) return -1;

        //如果差值大于1，返回-1，否者找出较大深度加上一并返回
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
    }
```




