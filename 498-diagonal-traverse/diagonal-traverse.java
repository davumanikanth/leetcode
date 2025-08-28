class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Map<Integer,ArrayList<Integer>> group=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                group.computeIfAbsent(i+j,k->new ArrayList<>()).add(mat[i][j]);
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry:group.entrySet())
        {
            int key=entry.getKey();
            ArrayList<Integer> list=entry.getValue();
            if(key%2==0)
            {
                Collections.reverse(list);
            }
         }
         int index=0;
         int[] result=new int[n*m];
         for(int i=0;i<n+m-1;i++)
         {
            ArrayList<Integer> list=group.get(i);
            for(int value:list)
            {
                result[index++]=value;
            }
         }
         return result;

        
    }
}