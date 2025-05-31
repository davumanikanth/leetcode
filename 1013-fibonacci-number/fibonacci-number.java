class Solution {
    public int fib(int n) {
        int[] nums=new int[n+1];
        int maxvalue=1;
        
        if(n==0)
        {
            return 0;

        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            nums[0]=0;
            nums[1]=1;
            for(int i=2;i<=n;i++)
            {
                nums[i]=nums[i-1]+nums[i-2];
               
            }

        }
       return nums[n]; 
    }
}