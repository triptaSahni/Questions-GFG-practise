class Solution {
    public int maxProfit(int[] prices) {
        // int low=Integer.MAX_VALUE;
        // int maxDiff=0;
        // for(int i=0;i<prices.length;i++)
        // {
        //     if(prices[i]<low)
        //         low=prices[i];
        //     if(prices[i]-low>=maxDiff)
        //         maxDiff=prices[i]-low;
        // }
        int low=prices[0];
        int maxDiff=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<low)
                low=prices[i];
            if(prices[i]-low>=maxDiff)
                maxDiff=prices[i]-low;
        }
        return maxDiff;
    }
}
