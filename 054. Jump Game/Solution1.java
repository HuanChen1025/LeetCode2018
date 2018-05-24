class Solution{
	
	  public static boolean canJump(int [] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, i + nums[i]);//当前能够到达的最大位置，以及当前点+能跳出的最大距离，两者比较
            if (max < i + 1) {
                return false;
            }

            if (max >= nums.length - 1) {
                //可以跳到最远位置
                return true;
            }
        }
        return false;
    }
}