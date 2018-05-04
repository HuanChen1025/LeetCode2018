### java

因为该链表是排序链表，所以处理起来很简单，只需要依次比较，并将值相同的链表结点跳过即可。

**核心代码**
```java
ListNode pHead = head;

while (pHead.next != null){
	//此处的处理逻辑有问题
	if (pHead.val == pHead.next.val){
	  ListNode temp = pHead.next.next;
	  pHead.next = temp;
	}
	else {
		pHead = pHead.next;
	}

}
```