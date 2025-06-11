class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        HashMap<Character,Integer> group=new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            group.put(ch,group.getOrDefault(ch,0)+1);

        }
        
       for(Map.Entry<Character,Integer> entry: group.entrySet())
       {
        if(entry.getValue()==1)
        {
            return s.indexOf(entry.getKey());
        }
       }
       return -1; 
    }
}