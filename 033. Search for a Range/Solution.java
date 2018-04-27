class Solution {
    public int[] searchRange(int[] nums, int target) {
            int [] result = {-1,-1};
        //У������
        if (nums.length == 0 || nums == null)
            return result;

        result[0] = leftSearch(nums,target);
        result[1] = rightSearch(nums,target);

        return result;
    }
    
     /**
     * ��������
     * @param nums
     * @param target
     * @return
     */
    private int leftSearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int middle = (start+end)/2;

        while (start<=end){
            if (nums[middle] == target){
                end = middle-1;
            }
            else if (nums[middle]>target){
                end = middle-1;
            }
            else if (nums[middle]<target){
                start = middle+1;
            }
            middle = (start+end)/2;
        }

        if (start>=0 && start<nums.length && nums[start]==target)
            return start;
        return -1;
    }
    
     /**
     * �ұ������߾�
     * @param nums
     * @param target
     * @return
     */
    private int rightSearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int middle = (start+end)/2;

        while (start<=end){
            if (nums[middle] == target){
                start = middle+1;
            }
            else if (nums[middle]>target){
                end = middle-1;
            }
            else if (nums[middle]<target){
                start = middle+1;
            }
            middle = (start+end)/2;
        }

        if (end>=0 && end<nums.length && nums[end]==target)
            return end;
        return -1;
    }

}