class Solution {
    public int majorityElement(int[] nums) {
                if (nums == null || nums.length ==0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if ( map.get(nums[i]) > nums.length/2){
                return nums[i];
            }
        }


        return 0;

    }
}