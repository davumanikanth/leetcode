class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int index=0;
        int[] love=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]==val)
            {
                continue;
            }
            else
            {
                love[index]=nums[i];
                index++;
            }
        }
    
        for(int i=0;i<index;i++)
        {
            nums[i]=love[i];
        }
        return index;
        
    }
}