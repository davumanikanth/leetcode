class Solution {
    public int tribonacci(int n) {
        int[] nums=new int[n+1];
        if(n==0)
        {
            return 0;

        }
        else if(n==1){
            return 1;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            nums[0]=0;
            nums[1]=1;
            nums[2]=1;
            for(int i=3;i<=n;i++)
            {
                nums[i]=nums[i-1]+nums[i-2]+nums[i-3];
            }
        }
        return nums[n];
    }
}