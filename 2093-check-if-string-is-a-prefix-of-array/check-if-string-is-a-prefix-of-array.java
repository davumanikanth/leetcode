class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder group=new StringBuilder();
        for(String word:words)
        {
            group.append(word);
            if(group.length()>s.length())
            {
                return false;
            }
            if(group.toString().equals(s))
            {
                return true;
            }

        }
        return false;
        
    }
}