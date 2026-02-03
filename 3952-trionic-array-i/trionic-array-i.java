class Solution {
    public boolean isTrionic(int[] arr) {
        int i=1;
        int n=arr.length;
        while(i<n && arr[i]>arr[i-1])
        {
            i++;
        }
        if(i==1) return false;
        int p=i;
        while(i<n && arr[i]<arr[i-1])
        {
            i++;
        }
        if(i==p) return false;
        int q=i;
        while(i<n && arr[i]> arr[i-1])
        {
            i++;
        }
        if(i==q) return false;
        if(i==n) return true;
        else return false;    

        
    }
}