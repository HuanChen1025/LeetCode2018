class Solution {
    public int getSum(int a, int b) {
        if (a == 0 || b==0)
            return a ==0?b:a;
        while (b != 0 ){
             int x = a^b; //a ∫Õ b «Û“ÏªÚ
             b = (a&b)<<1;
             a=x;
        }
        return a;
    }
}