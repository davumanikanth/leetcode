class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        HashMap<Character ,Integer> newmap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ') continue;
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
        int maxeven=s.length();
        int maxodd=1;
        for(int count: newmap.values()) 
        {
            if(count%2==0)
            {
                maxeven=Math.min(maxeven,count);
            }
            else
            {
                maxodd=Math.max(maxodd,count);
            }
            

        } 
      return maxodd-maxeven;
    }
}