class Solution {
    public int maxProfit(int[] prices) {
           //–£—È ‰»Î
        if (prices == null || prices.length == 0)
            return 0;

        int  resultMax = 0;
        int current = prices[0];

        for (int i=1;i<prices.length;i++){
            if (current>prices[i])
                current = prices[i];
            else {
                int currentMax = prices[i] - current;
                if (currentMax > resultMax)
                    resultMax = currentMax;
            }
        }
        return resultMax;
    }
}