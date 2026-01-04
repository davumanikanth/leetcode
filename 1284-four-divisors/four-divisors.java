class Solution {
    public int sumFourDivisors(int[] nums) {
       int totalsum=0;
       for(int num:nums)
       {

         int divcount=0;
         int divsum=0;
         for(int i=1;i*i<=num;i++)
         {
            if(num%i==0)
            {
                int d1=i;
                int d2=num/i;

                divcount++;
                divsum+=d1;

                if(d1!=d2)
                {
                   divcount++;
                   divsum+=d2; 
                }
                if(divcount>4)
                {
                    break;
                }

            }

         }
         if(divcount==4)
         {
            totalsum+=divsum;
         }


       }
       return totalsum;
        
    }
}