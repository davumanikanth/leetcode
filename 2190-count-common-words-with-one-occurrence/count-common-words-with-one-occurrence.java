class Solution {
    public int countWords(String[] words1, String[] words2) {
      Map<String,Integer> group=new HashMap<>();
       Map<String,Integer> group2=new HashMap<>();
      for(String word:words1)
      {
        group.put(word,group.getOrDefault(word,0)+1);
      }  
      for(String word:words2)
      {
        group2.put(word,group2.getOrDefault(word,0)+1);
      }
    
    int count=0;
    for(String str:group.keySet())
    {
        if(group.get(str)==1 && group2.getOrDefault(str,0)==1)
        {
            count++;
        }
    }
    return count;
    }
}