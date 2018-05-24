### java

题目不难，但是需要注意去掉重复数组的逻辑，尤其是开头就是需要 remove 的结点。

在AC 解答中，增加了两个辅助链表来实现移除结点的功能。

**核心代码**
```java
	//增加的辅助链表，保证在循环的时候可以从下一个结点开始，最后返回的时候忽略第一个结点
	ListNode helper = new ListNode(0);
	helper.next  = head;

	ListNode pHead =  helper;

	while (pHead.next != null){
		//如果相等，跳过下一个
		if (pHead.next.val == val){//如果相等，需要跳过这个
			pHead.next = pHead.next.next;
		}
		else {
			pHead = pHead.next;
		}

	}
```