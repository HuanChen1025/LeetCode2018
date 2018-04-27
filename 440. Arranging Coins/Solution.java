class Solution {
    public int arrangeCoins(int n) {
        if (n <= 1) return n;

        long start =0;
        long end =n;

        while (start < end){
            long middle = start +(end-start)/2;

            long sum = middle*(middle+1)/2;

            if (sum>n){
                end = middle;
            }
            else if (sum<=n){
                    start = middle+1;
            }

        }
        return (int)start-1;  
    }
}