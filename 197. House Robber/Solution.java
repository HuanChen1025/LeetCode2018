class Solution {
    public int rob(int[] nums) {
                int curMax = 0, curPrePreMax = 0;
        for (int cur : nums) {
            int temp = curMax;
            curMax = Math.max(curMax, curPrePreMax + cur);
            curPrePreMax = temp;
        }
        return curMax;
    }
}