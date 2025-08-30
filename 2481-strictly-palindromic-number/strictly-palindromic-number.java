class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String[] res=new String[n-3];
        int index=0;
        for(int i=2;i<=n-2;i++)
        {
           
          res[index++]=Integer.toString(n,i);


        }
        for(int i=0;i<index;i++)
        {
            String rev=new StringBuilder(res[i]).reverse().toString();
            if(!res[i].equals(res))
            {
                return false;

            }
        }
        return true;
        
    }
}