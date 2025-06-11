class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        String result="";
        for(int i=0;i<n;i++)
        {
            String temp=words[i];
            String temp1=reverse(temp);
            if(temp.equals(temp1))
            {
                return temp;
            }
        }
        return result;
        
    }
    public String reverse(String word)
    {
        int n=word.length();
        String result="";
        for(int i=n-1;i>=0;i--)
        {
            char ch=word.charAt(i);
            result=result+ch;

        }
        return result;
    }
}