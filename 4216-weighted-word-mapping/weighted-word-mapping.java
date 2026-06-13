class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            int sum=0;
            for(int j=0;j<words[i].length();j++)
            {
                sum+=weights[words[i].charAt(j)-'a'];
            }
            str.append((char)(122-(sum%26)));


        }
        return str.toString();
    }
}