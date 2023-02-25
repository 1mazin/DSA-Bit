class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            if(prices[i]>min)
            {
                int profit=prices[i]-min;
                max=Math.max(max,profit);
            }
            
        }
        if(max<0)return 0;
        else return max;
        
    }
}