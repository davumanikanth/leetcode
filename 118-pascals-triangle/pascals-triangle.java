class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
       
        for(int row=1;row<=numRows;row++)
        {    List<Integer> group=new ArrayList<>();
            for(int coloum=1;coloum<=row;coloum++)
            { 

                group.add(pascaltriangle(row-1,coloum-1));
                           
            }
            ans.add(group);
        }
        return ans;
        
    }
    public int pascaltriangle(int r,int n)
    {
        int result=1;
        for(int i=0;i<n;i++)
        {
            result=result*(r-i);
            result=result/(i+1);

        }
        return (int )result;
    }
}