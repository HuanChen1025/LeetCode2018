class Solution {
    public int[] plusOne(int[] digits) {
                if (digits == null || digits.length ==0)
            return null;

        //从后向前遍历
        int carry =1;   //用于判断该当前位加一是否有进位
        for (int i=digits.length-1;i>=0;i--){
            //如果 carry == 0,说明加一之后不为表为产生位数增加，直接返回
            if (carry ==0){
                return digits;
            }
            int temp = digits[i]+1;
            carry = temp/10;    //判断加一后是否产生了进位
            digits[i] = temp%10;    //如果产生了进位则为 0，如果没有产生进位，则为加一后的数字
        }

        if (carry == 1){
            int[] result = new int[digits.length+1];
            //初始化为 0
            for (int i=0;i<result.length;i++){
                result[i]=0;
            }
            result[0] =1;
            return result;
        }
        return digits;
    }
}