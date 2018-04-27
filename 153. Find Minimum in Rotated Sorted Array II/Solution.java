class Solution {
    public int findMin(int[] nums) {
               if (nums == null || nums.length == 0)
            return 0;

        int start =0;
        int end = nums.length-1;
        //第一个数小于最后一个数，说明是完全升序
        if (nums[start]<nums[end])
            return nums[start];

        int middle=0;
        while (start<=end){
             middle = start +(end-start)/2; //需要保证不能 int 相加出现溢出

            //让中位数和右边的数字比较
            if (nums[middle]>nums[end]){
                start = middle+1;
            }
            //如果 end = middle-1 的话，不能通过 {3,1,2}
            else if (nums[middle]<nums[end]){
                end = middle;//因为这里的 end 可能就是最小值，不能加一
            }
            //如果中间和最后相等。怎么查找，主要前后移动方向不确定
            //无法确定的时候，让 右边的值自减就好了
            else {
                end--;
            }
        }
            return nums[start]; 
    }
}