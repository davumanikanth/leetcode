class Solution {
    public String truncateSentence(String s, int k) {
        String [] word=s.split("\\s+");
   
        String [] result=new String[k];
        for(int i=0;i<k;i++)
        {
            result[i]=word[i];
        }
        String sentence=String.join(" ",result);
        return sentence;

        
    }
}