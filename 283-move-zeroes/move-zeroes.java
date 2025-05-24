class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                temp[count]=nums[i];
                count++;
                
            }
        }
        for(int i=count;i<n;i++)
        {
            temp[i]=0;

       }
        for(int i=0;i<n;i++)
        {
            nums[i]=temp[i];
        }
   
    }
    }
