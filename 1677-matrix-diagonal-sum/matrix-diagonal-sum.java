class Solution {
    public int diagonalSum(int[][] math) {
        int n=math.length;
        int result=0;
        for(int i=0;i<n;i++)
        {
            result=result+math[i][i];
            result=result+math[n-i-1][i];
            

        }
        if(n%2!=0)
            {
                result-=math[n/2][n/2];
            }
        return result;
    }
}