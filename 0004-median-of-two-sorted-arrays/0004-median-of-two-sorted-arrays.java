class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int d=n+m;
        int[] b=new int[d];
        for(int i=0;i<n;i++)
        {
            b[i]=nums1[i];
        }
        for(int i=0;i<m;i++) 
        {
           b[i+n]=nums2[i];
        }
        Arrays.sort(b);
        int mid=d/2;
        if(d%2!=0)
        {
            return b[mid];
        }
        else
        {
            return (b[mid]+b[mid-1])/2.0;
        }
    }
}