class Solution {
    public int findMin(int[] nums) {
             if (nums == null || nums.length == 0)
            return 0;

        int start =0;
        int end = nums.length-1;
        if (nums[start]<nums[end])
            return nums[start];
        int middle=0;
        while (start<end){
             middle = start +(end-start)/2; //需要保证不能 int 相加出现溢出

            //让中位数和右边的数字比较
            if (nums[middle]>nums[end]){
                start = middle+1;
            }
            else if (nums[middle]<nums[end]){
                end = middle;
            }
        }

            return nums[start];   
    }
}