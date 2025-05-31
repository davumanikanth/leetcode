class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answer=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            answer.add(pascaltriangle(rowIndex,i));
        }
        return answer;
        
    }
    public int pascaltriangle(int r,int c)
    {
        long result=1;
        for(int i=0;i<c;i++)
        {
            result=result*(r-i);
            result=result/(i+1);

        }
        return (int)result;
    }
}