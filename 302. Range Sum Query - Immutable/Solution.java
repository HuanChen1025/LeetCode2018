class NumArray {



    int[] dp;

    /**
     * 构造函数
     * @param nums
     */
    public NumArray(int[] nums) {
      dp = nums;

       for (int i=1;i<nums.length;i++)
           dp[i] +=dp[i-1];
    }

    public int sumRange(int i, int j) {
        if (i>j || j>=dp.length)
           return 0;

        //如果 i 为 0 ，直接返回 dp[j] .因为包含两个端点，所以另外一个是 dp[i-1].
        return  i==0 ? dp[j] : dp[j]-dp[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */