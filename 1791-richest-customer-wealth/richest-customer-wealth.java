class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxvalue=0;
        for(int i=0;i<accounts.length;i++)
        {
        int sum=0;
        for(int j=0;j<accounts[0].length;j++)
        {
             sum+=accounts[i][j];
        }
          maxvalue=Math.max(maxvalue,sum);

        }
        return maxvalue;
         
        
    }
}