class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        HashMap<Character,Integer> newmap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
           char ch=s.charAt(i);
           if(newmap.containsKey(ch))
           {
            int count=newmap.get(ch);
             newmap.put(ch,count+1);
           }
           else 
           {
            newmap.put(ch,1);
           }
        }
        int max=Integer.MIN_VALUE;
        int firstfrq=newmap.get(s.charAt(0));
        for(int num: newmap.values())
        {
            if(firstfrq!= num)
            {
                return false;
            }
           
        }
      return true;
        
    }
}