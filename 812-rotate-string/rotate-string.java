class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++)
        {
            if(s.equals(goal))
            {
                return true;
            }
            s=reverse(s);
        }
        return false;
        
    }
    public String reverse(String s)
    {
        StringBuilder result=new StringBuilder();
        if(s.length()<=1)
        {
            return s;
        }
        char f1=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            result.append(ch);



        }
        result.append(f1);
       return result.toString();
    }
}