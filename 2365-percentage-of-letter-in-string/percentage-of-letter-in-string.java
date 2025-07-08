class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==letter)
            {
                count++;
            }
        }

        int value=(int)(((double)count/s.length())*100);
        return value;
        
    }
}