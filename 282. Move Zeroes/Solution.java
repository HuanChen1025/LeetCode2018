class Solution {
    public void moveZeroes(int[] nums) {
                if (nums == null || nums.length ==0)
            return;
        for (int i=nums.length-1;i>=0;i--){
            if (nums[i] == 0){
                moveArrays(nums,i); //将第 i 个元素移动到末尾
            }
        }
    }
    
     /**
     * 将第 i  个元素移动到末尾
     * @param nums
     * @param index
     */
    private void moveArrays(int[] nums,int index){
        if (nums == null || nums.length ==0)
            return;
        for (int i=index+1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = 0;
    }
}