class Solution {
    public int findPeakElement(int[] nums) {
                if (nums.length == 0 || nums == null)
            return -1;


        for (int i=0;i<nums.length;i++){
            int currentValue =nums[i];
            int preIndex = i-1;
            int preValue =0;
            int nextIndex =i+1;
            int nextValue =0;

            if (preIndex<0)
                preValue=Integer.MIN_VALUE;
            else
                preValue = nums[preIndex];

            if (nextIndex>=nums.length)
                nextValue = Integer.MIN_VALUE;
            else
                nextValue = nums[nextIndex];

            if (currentValue>preValue && currentValue>nextValue)
                return i;
        }
        return 0;
    }
}