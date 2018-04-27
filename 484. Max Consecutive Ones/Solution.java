class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
              if (nums.length == 0 || nums == null)
            return 0;

        int res = 0;

        int temCount = 0;

        for (int i=0;i<nums.length;i++){
            if (nums[i] == 1)
                temCount++;
            else if (nums[i] == 0){
                if (temCount>res)
                    res=temCount;
                temCount=0;
            }
        }
         return temCount>res?temCount:res; 
    }
}