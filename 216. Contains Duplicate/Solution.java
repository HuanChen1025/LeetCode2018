class Solution {
    public boolean containsDuplicate(int[] nums) {
        //����У�飬�����Ϸ��� false
        if (nums == null || nums.length == 0)
            return false;

        Arrays.sort(nums);

        //��������
        for (int i=1;i<nums.length;i++){
            if (nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}