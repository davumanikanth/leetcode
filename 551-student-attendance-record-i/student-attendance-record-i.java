class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL"))
        {
            return false;
        }
        int aa=0;
       for(int i=0;i<s.length();i++)
       {
         char ch=s.charAt(i);
         if(ch=='A')
         {
            aa++;
         }
       }
       if(aa>=2)
       {
        return false;
       }
        
        return true;
    }
}