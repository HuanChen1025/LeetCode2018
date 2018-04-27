class Solution {
    public boolean containsDuplicate(int[] nums) {
        //输入校验，不符合返回 false
        if (nums == null || nums.length == 0)
            return false;

        Arrays.sort(nums);

        //遍历数组
        for (int i=1;i<nums.length;i++){
            if (nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}