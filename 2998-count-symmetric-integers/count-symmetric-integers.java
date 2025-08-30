class Solution {
    public int countSymmetricIntegers(int low, int high) {
       
        int count=0;
        for(int i=low;i<=high;i++)
        {
            
            String str=String.valueOf(i);
            if(str.length()%2!=0)
            {
                 continue;
            }
            String num1=str.substring(0,str.length()/2);
            String num2=str.substring(str.length()/2);
             int sum1=0;
             int sum2=0;
            for(int j=0;j<num1.length();j++)
            {
                sum1+=num1.charAt(j)-'0';
            }
            for(int k=0;k<num2.length();k++)
            {
                sum2+=num2.charAt(k)-'0';
            }
            if(sum1==sum2)
            {
                count++;
            }

        }
        return count;
    }
}