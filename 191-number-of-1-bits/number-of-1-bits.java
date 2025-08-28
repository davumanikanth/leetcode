class Solution {
    public int hammingWeight(int n) {
        String result=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<result.length();i++)
        {
            char ch=result.charAt(i);
            if(ch=='1')
            {
                count++;
            }
        }

        return count;
        
    }
}