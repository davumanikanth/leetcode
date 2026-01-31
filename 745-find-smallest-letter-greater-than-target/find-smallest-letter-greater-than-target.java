class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      
        int   num=Integer.MAX_VALUE;
        
        
        for(int i=0;i<letters.length;i++)
        {
            int ch=(int)letters[i];
            if(ch>(int) target )
            {
                num=Math.min(ch,num);
            }
        }
        if(num==Integer.MAX_VALUE)
        {
            return letters[0];
        }
        return (char)num;
    }
}