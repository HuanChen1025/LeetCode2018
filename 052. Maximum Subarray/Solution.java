class Solution {
    public int maxSubArray(int[] nums) {
                 if (nums == null || nums.length ==0)
            return 0;
        

        int max = nums[0];
        int current = nums[0];
        for (int i=1;i<nums.length;i++){
              if (current<0)
                current=0;
            current += nums[i];
            if (current>max)
                max=current;

          
        }
        return max;
    }
}