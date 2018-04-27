class Solution {
    public int maxProfit(int[] prices) {
              if (prices == null || prices.length == 0)
            return 0;

        int max = 0;
        for (int i=1;i<prices.length;i++){
            //采用 i，i-1 形式，而不是 i+1,i 的形式
            if (prices[i]>prices[i-1]){
                max +=(prices[i]-prices[i-1]);
            }
        }
        return max;
    }
}