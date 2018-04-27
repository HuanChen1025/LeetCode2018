class Solution {
    public int removeDuplicates(int[] nums) {
              if (nums.length == 0)
            return 0;

        int idx =0;
        int count =0;

        for (int i=0;i<nums.length;i++){
            if (i>0 && nums[i] == nums[i-1]){
                count++;
                if (count>2){
                    continue;//继续执行for循环，避免使用break
                }
               
            }
            else {
                count=1;
            }
            nums[idx] = nums[i];
            idx++;

        }


        return idx;
  
    }
}