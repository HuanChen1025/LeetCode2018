class Solution {
    public int minSubArrayLen(int s, int[] nums) {
               if (nums.length == 0 || nums == null)
            return 0;

        int slow = 0;
        int fast = 0;

        int sum = 0;

        int res =Integer.MAX_VALUE;

        while (fast<nums.length){
            sum = sum(nums,slow,fast);
            if (sum<s){
                fast++;
            }
            else if (sum>s){//Ҫ�ǵ�һ���ʹ���s�أ�

                int temp = fast-slow+1;
                //ȡ��Сֵ
                if (temp<res)
                    res=temp;

                slow++;

            }
            else {
                int temp = fast-slow+1;
                fast++;
                //ȡ��Сֵ
                if (temp<res)
                    res=temp;
            }
        }
        if (res == Integer.MAX_VALUE)
            res =0;

        return res; 
    }
    private int sum(int[]nums,int start,int end){
    if (nums.length == 0 || start>end)
        return 0;
    int sum =0;
    for (int i=start;i<=end;i++){
        sum +=nums[i];
    }
    return sum;
}
}