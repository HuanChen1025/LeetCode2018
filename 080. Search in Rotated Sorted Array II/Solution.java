class Solution {
    public boolean search(int[] nums, int target) {
          //У������
        if (nums.length == 0 || nums == null)
            return false;

        int start = 0;
        int end =nums.length -1;

        //�õ��ֽ��
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
     * �˴��������ұ߽�Ŀ�ʼλ��
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