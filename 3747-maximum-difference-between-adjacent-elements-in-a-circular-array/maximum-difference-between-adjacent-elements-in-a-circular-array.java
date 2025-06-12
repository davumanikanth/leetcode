class Solution {
    public int maxAdjacentDistance(int[] arr) {
    int n=arr.length;
    int maxvalue=Integer.MIN_VALUE;
    for(int i=1;i<n;i++)
    {
        maxvalue=Math.max(maxvalue,Math.abs(arr[i]-arr[i-1]));

    }   
    maxvalue=Math.max(maxvalue,Math.abs(arr[n-1]-arr[0]));
    return maxvalue; 
        
    }
}