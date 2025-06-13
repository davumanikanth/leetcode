class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.replaceAll("[^A-Za-z0-9]","");
       
        
        String ch="";
        ch=s.toLowerCase();
        String temp=ch;
        String str=new StringBuilder(ch).reverse().toString();
        if(temp.equals(str))
        {
            return true;
        }
        return false;

        
    }
}