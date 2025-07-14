class Solution {
    public int countDigits(int num) {

        int count=0;
        String intstr=Integer.toString(num);
        for(int i=0;i<intstr.length();i++)
        {
            int ch=intstr.charAt(i)-'0';
            if(num%ch==0)
            {
                count++;
            }
           
        }
        return count;
        
    }
}