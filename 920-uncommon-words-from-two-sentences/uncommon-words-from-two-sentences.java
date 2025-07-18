class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> group=new HashMap<>();
        String[] first=s1.split(" ");
        String[] second=s2.split(" ");
        for(int i=0;i<first.length;i++)
        {
            group.put(first[i],group.getOrDefault(first[i],0)+1);
        }
        for(int i=0;i<second.length;i++)
        {
            group.put(second[i],group.getOrDefault(second[i],0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer> entry:group.entrySet())
        {
            if(entry.getValue()==1)
            {
               count++;
            }
        }
        String[] word=new String[count];
        int index=0;
       for(Map.Entry<String,Integer> entry:group.entrySet())
        {
            if(entry.getValue()==1)
            {
               word[index++]=entry.getKey();
            }
        }
        return word;
       
       
        
    }
}