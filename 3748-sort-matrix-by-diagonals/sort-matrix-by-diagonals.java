class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Map<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int key=i-j;
                if(key>=0)
                {
                       map.computeIfAbsent(key,k->new PriorityQueue<>(Collections.reverseOrder())).add(grid[i][j]);
                }
                else
                {
                map.computeIfAbsent(key,k->new PriorityQueue<>()).add(grid[i][j]);
                }
            }

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                grid[i][j]=map.get(i-j).poll();
            }
        }
        return grid;
    }
}