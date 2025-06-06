class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] result=new int[n+n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            result[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            result[n+i]=nums[i];
        }
        return result;
        
    }
}