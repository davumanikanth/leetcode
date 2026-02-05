class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int steps=nums[i];
            int index=i;
            if(steps==0)
            {
                result[i]=nums[i];
            }
            else if(steps>0)
            {
                while(steps-- >0)
                {
                    index++;
                    if(index==n) index=0;
                }

                result[i]=nums[index];
            }
            else 
            {
                while(steps++ <0)
            {
                index--;
                if(index==-1) index=n-1;
                result[i]=nums[index];
            }
            }

        
        }
            return result;

    }
}