### java

这道题难度还是很大，最后在 discuss 上看了其他大神的方法，理解了自己写出来的。

采用的算法是回溯法：

Used backtracking to solve this.
Build an array to apply to "subset" template. Each time we add an element to the "list", for the next step, target= target - num[i]. 
Since we have already added one element, for the next step, we can only add k-1 elements. Since no duplicated elements accept, 
for the next loop, the "start" should point to the next index of current index. The list.remove(list.size() - 1) here means, 
we need to change the element here. I know it is hard to understand it, let me give you an example.
When k=3, n=9, my answer works like this:
[1]->[1,2]->[1,2,3]. Since now sum is not 9, no more backtracking, so after list.remove(list.size() - 1), it is [1,2]. Then next follows
 [1,2,4], sum is not 9, repeat process above untill [1,2,6]. When go to next backtracking, the list will be added to result, and for this
 list, no more backtracking.
Now we can go back to a previous backtracking, which is [1,3]->[1,3,4], fail. [1,4,]->[1,4,5], fail. And so one.
So the point of list.remove(list.size() - 1) is, after each "fail" or "success", since we don't need to do further attempts given such 
a condition, we delete the last element, and then end current backtracking. Next step is, add the next element to the deleted index, 
go on attempting.

