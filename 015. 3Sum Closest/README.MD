### java 

参考 discuss：https://leetcode.com/problems/3sum-closest/discuss/7872/Java-solution-with-O(n2)-for-reference

不会解，最开始想到的是暴力法，根本不可行

最好的方式是对数组排序，然后依次循环遍历，核心代码：

```java
        int result = nums[0] + nums[1] + nums[nums.length-1]; //result的初始值
        Arrays.sort(nums);

        for (int i = 0;i<nums.length-2;i++){ //从索引 0 开始，循环遍历
            int start = i+1; int end = nums.length-1;
            while (start<end){
                int sum = nums[i] + nums[start] + nums[end];
                if (sum>target){
                    end--;
                }
                else {
                    start++;
                }
                if (Math.abs(sum-target) < Math.abs(result-target)){
                    result = sum; //找出最小值
                }
            }
        }
```