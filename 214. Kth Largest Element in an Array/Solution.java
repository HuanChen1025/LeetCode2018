class Solution {
    public int findKthLargest(int[] nums, int k) {
                //ºÏ—È ‰»Î
        if (nums == null || nums.length == 0 || k<=0 || k>nums.length)
            return -1;

        List<Integer> list = new ArrayList<>();

        for (int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }

        Collections.sort(list);

        Collections.reverse(list);

        return list.get(k-1);
    }
}