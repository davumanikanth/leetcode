class Solution {
    public String thousandSeparator(int n) {
        String num=String.valueOf(n);
        StringBuilder result=new StringBuilder();
        int count=0;
        for(int i=num.length()-1;i>=0;i--)
        {
            
            char ch=num.charAt(i);
            

            result.append(ch);
            count++;
            if(count%3==0  && i!=0)
            {
                result.append(".");
            }

        }
         return result.reverse().toString();
        
    }
}