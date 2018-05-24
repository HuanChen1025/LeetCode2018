class Solution {
    public int countPrimes(int n) {
       boolean[] isPrimes = new boolean[n];

        if (n<2)
            return 0;

        int count =0;

        for (int i=2;i<n;i++){

            if (isPrimes[i] == false){
                count++;
                //针对当前选中的质数，去掉除它自己外，在 小于 n 的范围内的其他的倍数
                for (int j=2;i*j<n;j++){
                    isPrimes[i*j] = true;
                }
            }
        }
        return count; 
    }
}