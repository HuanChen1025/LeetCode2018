class Solution {
    public int removeDuplicates(int[] nums) {
                if (nums.length == 0 || nums == null)
            return 0;
        //判断无输入
        int number = 0;//标记计数
        for (int i=0; i < nums.length ; i++) {
            if ( nums[i] != nums[number] ) {
                number++;
                nums[number] = nums[i];
            }
        }
        number+=1; //标记+1即为数字个数
        return number;
    }
}