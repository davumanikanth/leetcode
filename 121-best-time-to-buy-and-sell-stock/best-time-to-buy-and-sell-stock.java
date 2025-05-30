class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int mini=price[0];
        int profit=0;
        for(int i=1;i<n;i++)
        {
             int cost=price[i]-mini;
            profit=Math.max(cost,profit);
            mini=Math.min(price[i],mini);
        }
        return  profit;
        
    }
}