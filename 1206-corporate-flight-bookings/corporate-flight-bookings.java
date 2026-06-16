class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr=new int[n];
        for(int [] e:bookings)
        {
            int u=e[0];
            int v=e[1];
            int w=e[2];
            for(int i=u;i<=v;i++)
            {
                arr[i-1]+=w;

            }

        }
        return arr;
        
    }
}