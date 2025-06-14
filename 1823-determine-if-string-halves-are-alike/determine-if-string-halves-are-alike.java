class Solution {
    public boolean halvesAreAlike(String s) {
        int half1=0;
        int half2=0;
        for(int i=0;i<s.length()/2;i++)
        {
            char ch=s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        half1++;
    }
        }
                for(int i=s.length()/2;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        half2++;
    }
        }
        if(half1==half2)
        {
            return true;

        }
        return false;
        
    }
}