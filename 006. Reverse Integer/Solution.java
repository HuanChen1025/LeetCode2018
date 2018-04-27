class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x<0){
            isNegative = true;
           x = Math.abs(x);       //��ȡ����ֵ
        }
        long result =0;
        while (x!=0){
            int temp = x%10;
            x /=10;
            result =  result*10 + temp;
            if (result>0x7FFFFFFF || result<0x80000000)
                return 0;
        }
        return isNegative?(int)-result:(int)result;
    }
}