class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length ==0)
        return true;
        int len = nums.length;

        int reach =0, i=0;

        for ( i=0;i<=reach && i<len;i++){
            //贪心算法，更新能够到达的最远点，
            reach = Math.max(reach,nums[i]+i);
        }
		//如果i 的长度和 数组长度不一致，返回 false
        return i == len;
    }
}