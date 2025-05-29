class Solution {
    public int countNegatives(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        int negative=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums[i][j]<0)
                {
                    negative++;
                }
            }
        }
        return negative;
        
    }
}