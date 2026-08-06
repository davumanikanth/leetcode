class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n;
        boolean flag = false;
        while(flag==false)
        {
            n=temp;
            int pro=1;
            while(n>0)
            {
                pro*=n%10;
                n=n/10;

            }
            System.out.println(pro);
            if(pro%t==0)
            {
                   flag=true;
            }else
            {
                temp++;
            }

        }
        return temp;

        
    }
}