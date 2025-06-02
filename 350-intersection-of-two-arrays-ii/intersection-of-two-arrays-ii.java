class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int minlength=Math.min(nums1.length,nums2.length);
        int index=0;
        int[] temp=new int[minlength];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                   if(nums1[i]==nums2[j])
                   {
                    temp[index++]=nums1[i];
                    nums2[j]=-1;
                    break;
                   }

            }
        }
        int[] newarray=new int[index];
        for(int i=0;i<index;i++)
        {
            newarray[i]=temp[i];
        }
        return newarray;
        
    }
}