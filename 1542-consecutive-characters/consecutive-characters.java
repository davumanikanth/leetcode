class Solution {
    public int maxPower(String s) {
        int count=1;
            int maxcount=1;
        for(int i=0;i<s.length()-1;i++)
        {
            
            char ch=s.charAt(i);
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
                maxcount=Math.max(count,maxcount);
            }
            else
            
            {
                count=1;

            }
            

        }
        return maxcount;
    }
}