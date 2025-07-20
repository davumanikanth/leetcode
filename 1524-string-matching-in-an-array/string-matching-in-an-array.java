class Solution {
    public List<String> stringMatching(String[] words) {
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=0;j<words.length-i-1;j++)
            {
                if(words[j].length() > words[j+1].length())
                {
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].contains(words[j]))
                {
                    count++;
                }

            }
        }
        String[] word=new String[count];
        int index=0;
        List<String> group=new ArrayList<>();
        Set<String> group1=new LinkedHashSet<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[j].contains(words[i]))
                {
                    group1.add(words[i]);
                }

            }
        }
        for(String str: group1)
    
        {
            group.add(str);
        }
        return group;
        
    }
}