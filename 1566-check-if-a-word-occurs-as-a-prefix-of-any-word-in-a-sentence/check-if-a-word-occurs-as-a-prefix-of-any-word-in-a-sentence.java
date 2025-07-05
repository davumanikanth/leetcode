class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
    sentence=sentence.trim();
      String[] word=sentence.split(" "); 
    int [] indexs=new int[word.length];
    int index=0;
    for(int i=0;i<word.length;i++)
    {
    if(word[i].startsWith(searchWord))
        {
           indexs[index++]=i;
        }
    } 
    if(index==0){

        return -1;
    }
    return indexs[0]+1;
    }
}