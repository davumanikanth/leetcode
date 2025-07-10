class Solution {
    public int heightChecker(int[] heights) {
        int[] same=heights.clone();
        Arrays.sort(same);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(same[i]!=heights[i])
            {
                count++;

            }
        }
        return count;
        
    }
}