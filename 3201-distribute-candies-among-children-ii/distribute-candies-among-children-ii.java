class Solution {
    public long distributeCandies(int n, int limit) {
        long ways=0;
        int aMin=Math.max(0,n-2*limit);
        int aMax=Math.min(limit,n);
        for(int a=aMin;a<=aMax;a++)
        {
            int remaining=n-a;
             
             int bMin= Math.max(0,remaining-limit);
             int bMax=Math.min(remaining,limit);
             if (bMax >= bMin) {
                ways += (bMax - bMin + 1);
            }
             
        }
        return ways;
    }
}