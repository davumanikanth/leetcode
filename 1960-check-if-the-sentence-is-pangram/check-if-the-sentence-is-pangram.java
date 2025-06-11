class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        if(n<26) return false;
        for(int i='a';i<='z';i++)
        {
            if(sentence.indexOf(i)==-1)
            {
                return false;
            }
        }
        return true;
        
    }
}