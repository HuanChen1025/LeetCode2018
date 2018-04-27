class Solution {
    public int missingNumber(int[] nums) {
        if (nums==null || nums.length==0)
            return 0;

        int n = nums.length;

        //¶Ô 0 ¡ª nÇóºÍ
        long sum = (n+0)*(n+1)/2;

        long result = 0;

        for (int i=0;i<nums.length;i++){
            sum = sum - (long)nums[i];
        }
        return (int)sum;
    }
}