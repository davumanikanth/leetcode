class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         
        int[] love=new int[n+m];
        for(int i=0;i<m;i++)
        {
            love[i]=nums1[i];
            
        }
        for(int j=0;j<n;j++)
        {
            love[j+m]=nums2[j];
            
        }
        Arrays.sort(love);
         for (int i = 0; i < m + n; i++) {
            nums1[i] = love[i];
        }
        
    }
}