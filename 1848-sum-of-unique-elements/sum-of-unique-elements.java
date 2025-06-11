class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                arr[index++]=nums[i];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
        
    }
}