class Solution {
    public void rotate(int[] nums, int k) {
                //校验输入
        if (nums == null || nums.length == 0)
            return;
          k = k%nums.length;
        //翻转整个字符串
        reverseArray(nums,0,nums.length-1);

        //翻转前 k 个字符串
        reverseArray(nums,0,k-1);

        reverseArray(nums,k,nums.length-1);
    }
    
        /**
     * 翻转数组，
     * @param nums
     * @param begin
     * @param end
     */
    private void reverseArray(int [] nums,int begin,int end){
        while (begin<end){
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end]= temp;
            begin++;
            end--;
        }
    }
}