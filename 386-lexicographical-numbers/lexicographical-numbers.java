class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> StringList=new ArrayList<>();

        for(int i=1;i<=n;i++)
        {  
            StringList.add(String.valueOf(i));


        }

        Collections.sort(StringList);
        List<Integer> result=new ArrayList<>();

        for(String s: StringList)
        {
                        result.add(Integer.parseInt(s));

        }
        return result;
        
    }
}