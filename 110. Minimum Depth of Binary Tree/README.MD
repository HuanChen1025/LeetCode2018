### java

采用递归求解，非常简单与简洁，但是这道题的递归我有一点不太理解。
**核心代码**

```java
 public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        //如果left 或 right 返回为 0，说明遇到了叶节点，
        //如果 left为0，返回 right+1;如果right为0，返回left+1【因为在此之前，他们应该是相等的】
        //否则返回两者中较小的一个并加1
        return (left == 0 || right ==0)?left+right+1:Math.min(left,right)+1;
    }
}
```

在LeetCode 中，最快的解法是采用循环求解的。