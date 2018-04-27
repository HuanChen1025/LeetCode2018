class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                List<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length<3)
            return res;

        //¶ÔÊı×éÅÅĞò
        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();

        int i=0;int last = nums.length-1;

        while (i<last){
            int a= nums[i];int j=i+1;int k =last;
            while (j<k){
                int b = nums[j];int c = nums[k];
                int sum = a + b +c;

                if (sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(a);
                    temp.add(b);
                    temp.add(c);
                    set.add(temp);
                }
                if (sum>=0 )
                    while (nums[k] == c && j < k) --k;
                if (sum<=0 )
                    while (nums[j] == b && j < k ) ++j;

            }
            while (nums[i] == a && i < last) ++i;
        }

        for (List<Integer> list :
                set) {
            res.add(list);
        }

        return res;
    }
}