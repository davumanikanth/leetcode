class Solution {
    public boolean judgeCircle(String moves) {
        int upper=0;
        int lefter=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='U')
            {
                upper++;
            }
            else if(ch=='D')
            {
                upper--;
            }
            else if(ch=='L')
            {
                lefter++;
            }
            else if(ch=='R')
            {
                lefter--;
            }
        }
        if(upper==0 && lefter==0)
        {
            return true;
        }
        return false;
        
    }
}