class Solution {
    public String lexSmallest(String s) {
        int len=s.length();
        int rlen=len-1;
        if(len==1)
        {
            return s;
        }
      ArrayList<String> group=new ArrayList<>();

        String[] result=new String[2*rlen];
        for(int i=0;i<len;i++)
        {
            String prefix=s.substring(0,i);
            String suffix=s.substring(i);
            group.add(reverse(prefix) + suffix);
            group.add(prefix+ reverse(suffix));

           
        }
        Collections.sort(group);
        return group.get(0);
       

        
    }
    public String reverse(String ss)
    {
        return new StringBuilder(ss).reverse().toString();
    }
    
}