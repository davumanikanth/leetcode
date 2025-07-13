class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        if(index==-1)
        {
            return word;
        }
        
        String newWord=word.substring(0,index+1);
        String after=word.substring(index+1);
        String result=new StringBuilder(newWord).reverse().toString();
        return result.toString()+after;


        
    }
}