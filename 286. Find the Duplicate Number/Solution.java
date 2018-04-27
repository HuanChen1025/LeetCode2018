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
            //������㣬˵�� 1-middle ֮�����ظ�����
            if (count>middle)
                high = middle-1;
            else
                low=middle+1;
        }

        return low;
    }
}