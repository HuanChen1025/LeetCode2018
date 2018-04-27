class Solution {
    public void rotate(int[] nums, int k) {
                //У������
        if (nums == null || nums.length == 0)
            return;
          k = k%nums.length;
        //��ת�����ַ���
        reverseArray(nums,0,nums.length-1);

        //��תǰ k ���ַ���
        reverseArray(nums,0,k-1);

        reverseArray(nums,k,nums.length-1);
    }
    
        /**
     * ��ת���飬
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