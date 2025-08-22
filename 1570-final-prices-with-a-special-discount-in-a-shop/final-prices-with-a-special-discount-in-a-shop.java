import java.util.Stack;
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result=prices.clone();
        // Stack<Integer> stack=new Stack<>();
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    result[i]=prices[i]-prices[j];
                    break;
                }
            }

        }
        
        return result;
        
    }
}