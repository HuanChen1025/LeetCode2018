class Solution {
    public int findDuplicate(int[] nums) {
                int high = nums.length-1;
        int low = 0;

        while (high>=low){
            int middle = low +(high-low)/2;
            int count = 0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]<=middle){
                    count++;
                }
            }
            //如果满足，说明 1-middle 之间有重复数字
            if (count>middle)
                high = middle-1;
            else
                low=middle+1;
        }

        return low;
    }
}