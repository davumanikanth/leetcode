class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        f(0,s,ans,new ArrayList<>());
        return ans;

        
    }
    public void f(int index,String s,List<List<String>> ans,ArrayList<String> group)
    {
        if(index==s.length())
        {
            ans.add(new ArrayList<>(group));
        }
        for(int i=index;i<s.length();i++)
        {
            if(ispa(s,index,i))
            {
                group.add(s.substring(index,i+1));
                f(i+1,s,ans,group);
                group.remove(group.size()-1);

            }
        }
    }
    public boolean ispa(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}