class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] first=word1.toCharArray();
        char[] second=word2.toCharArray();
        int maxlength=Math.max(first.length,second.length);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<maxlength;i++)
        {
            if(i<first.length)
            {
                result.append(first[i]);
            }
            if(i<second.length)
            {
                result.append(second[i]);
            }
        }
        return result.toString();
    }
}