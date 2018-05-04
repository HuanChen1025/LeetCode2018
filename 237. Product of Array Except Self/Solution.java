class Solution {
    public int[] productExceptSelf(int[] nums) {
                if (nums==null || nums.length==0){
            return nums;
        }

        //每一个位置都等于左边乘上右边（去除自己）
        int n= nums.length;

        int [] res = new int[n];

        res[0] =1;//第一个位置的左边为1
        //求左边,并且存储在 res 中
        for (int i=1;i<n;i++){
            res[i] = res[i-1] * nums[i-1];
        }

        //边计算右边，边计算最终结果，并存储在 res 中
        int right =1;
        for (int i=n-1;i>=0;i--){
            res[i] *= right; //左边乘上右边，就是当前的值
            right *= nums[i]; //更新 right 值
        }
        return res;
    }
}