class Solution {
    public boolean checkPerfectNumber(int num) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                set.add(i);
                sum=sum+i;
            }

        }
        if(sum==num)
        {
            return true;
        }
        return false;

        
    }
}