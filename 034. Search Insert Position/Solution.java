class Solution {
    public int searchInsert(int[] nums, int target) {
                if (nums == null || nums.length == 0)
            return 0;   //�˴��� 0  ��ʵ�ʷ��ص� 0 �������

        if (target<nums[0])
            return 0;
        if (target>nums[nums.length-1])
            return nums.length;

        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int middle =(start + end)/2;

            //ƥ�䣬��������
            if (nums[middle] == target){
                return middle;
            }

            else if (nums[middle] > target){
                end = middle-1;
            }

            else if (nums[middle] < target){
                start = middle +1;
            }
        }
        //���û�ҵ������� start λ��
        return start;
    }
}