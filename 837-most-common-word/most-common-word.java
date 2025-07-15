class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase();
     

     
        String[] word=paragraph.split("\\s+");
        Set<String> bannedword=new HashSet();
        for(String str:banned)
        {
            bannedword.add(str);
        }
        Map<String,Integer> group=new HashMap<>();
        for(int i=0;i<word.length;i++)
        {
            if(!bannedword.contains(word[i])){
            group.put(word[i],group.getOrDefault(word[i],0)+1);
            }
        }
        int max=0;
        String val="";
        for(Map.Entry<String,Integer> entry:group.entrySet())
        {
            if(entry.getValue()>max)
            {
                val=entry.getKey();
                max=entry.getValue();

            }

        }
        return val;
    }
}