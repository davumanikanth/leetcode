class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> group=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
             char ch=word.charAt(i);
             if(group.containsKey(ch))
             {
                if(Character.isLowerCase(ch))
                {
                    
                    group.put(ch,i);

                }
                else 
                {
                    int min=Math.min(i,group.get(ch));
                    group.put(ch,min);
                }
             }
             else
             {
                group.put(ch,i);
             }
        }
        int count=0;
        for(char ch='a';ch<='z';ch++)
        {
            char upper=Character.toUpperCase(ch);
            if(group.containsKey(ch) && group.containsKey(upper) && group.get(ch) <group.get(upper))
            {
                count++;
            }
        } 
        return count;
        
    }
}