class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String[] word=words.toArray(new String[0]);
        if(word.length!=s.length())
        {
            return false;
        }
        else
        {
            for(int i=0;i<word.length;i++)
            {
                char ch=s.charAt(i);
                if(word[i].charAt(0)!=ch)
                {
                    return false;
                }
            }
        }
        return true;
    }
}