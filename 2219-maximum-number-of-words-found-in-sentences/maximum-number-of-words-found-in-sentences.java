class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sent:sentences)
        {
            int wordlen=sent.split(" ").length;
             max=Math.max(wordlen,max);
             
            
        }
        return max;


        
    }
}