class Solution {
    public boolean detectCapitalUse(String word) {
        int lowercase=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
        if(Character.isLowerCase(ch))
        {
             lowercase++;
        }
       
        }
       if(lowercase==word.length())
       {
        return true;
       }
       else if(Character.isUpperCase(word.charAt(0)) && lowercase==word.length()-1 )
       {
        return true;
       }
       else if(lowercase==0)
       {
        return true;
       }

       return false;
    }
}