class Solution {
    public boolean search(int[] nums, int target) {
          //校验输入
        if (nums.length == 0 || nums == null)
            return false;

        int start = 0;
        int end =nums.length -1;

        //拿到分界点
        int index = findEdge(nums);

        boolean left = search(nums,start,index-1,target);

        boolean right = search(nums,index,end,target);


        return left || right;  
    }
    
     private static boolean search(int[] nums,int start,int end,int target){

        while (start <= end){
            int middle = start + (end -start)/2;
            if (nums[middle]>target){
                end = middle-1;
            }
            else if (nums[middle]<target){
                start = middle +1;
            }
            else {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 此处返回是右边界的开始位置
     * @param nums
     * @return
     */
    private static   int findEdge(int[] nums){
              for (int i=0;i<nums.length-1;i++){
            if (nums[i]>nums[i+1]){
                return i+1;
            }
        }
        return 0;
    }
}