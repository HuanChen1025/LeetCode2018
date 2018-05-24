class Solution {
    public int nthUglyNumber(int n) {
          //缓存数组
        int [] ugly = new int[n];
        ugly[0] =1;
        int index2 =0, index3 =0,  index5 =0;
        int factor2=2,factor3=3,factor5=5;

        for (int i=1;i<n;i++){
            ugly[i] = Math.min(Math.min(factor2,factor3),factor5);
            if (factor2 == ugly[i]) factor2 = 2*ugly[++index2]; //如果当前最小值和 factor2相等，则将factor2提升两倍。
            if (factor3 == ugly[i]) factor3 = 3*ugly[++index3];
            if (factor5 == ugly[i]) factor5 = 5*ugly[++index5];
        }

        //为什么是 n-1.因为索引下标是从0开始的
        return ugly[n-1]; 
    }
}