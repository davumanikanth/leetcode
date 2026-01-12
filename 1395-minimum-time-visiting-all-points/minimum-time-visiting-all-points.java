class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for(int i=0;i<points.length-1;i++)
        {
            int xpoint=points[i][0];
            int ypoints=points[i][1];
            int xtarget=points[i+1][0];
            int ytarget=points[i+1][1];
            sum+=Math.max(Math.abs(xpoint-xtarget),Math.abs(ypoints-ytarget));
        }
        return sum;
    }
}