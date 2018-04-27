class Solution {
    public int findMin(int[] nums) {
             if (nums == null || nums.length == 0)
            return 0;

        int start =0;
        int end = nums.length-1;
        if (nums[start]<nums[end])
            return nums[start];
        int middle=0;
        while (start<end){
             middle = start +(end-start)/2; //��Ҫ��֤���� int ��ӳ������

            //����λ�����ұߵ����ֱȽ�
            if (nums[middle]>nums[end]){
                start = middle+1;
            }
            else if (nums[middle]<nums[end]){
                end = middle;
            }
        }

            return nums[start];   
    }
}