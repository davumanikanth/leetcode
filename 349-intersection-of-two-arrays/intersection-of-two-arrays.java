class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // using two pointer
        // int n=nums1.length;
        // int m=nums2.length;
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // Set<Integer> msri=new LinkedHashSet<>();
        // int index=0;
        // int i=0;
        // int j=0;
        // while(i<n && j<m)
        // {
        //     if(nums1[i]<nums2[j])
        //     {
        //         i++;
        //     }
        //     else if(nums1[i]>nums2[j])
        //     {
        //         j++;
        //     }
        //     else
        //     {
        //         msri.add(nums1[i]);
        //          i++;
        //          j++;

        //     }
        // }
        // int[] sri=new int[msri.size()];
        // int love=0;
        // for(int num : msri)
        // {
        //     sri[love++]=num;
        // }
        // return sri;
        
        //usnig linkedhashset
        Set<Integer> set1=new HashSet<>();
        for(int n: nums1)
        {
            set1.add(n);
        }
        Set<Integer> set2=new HashSet<>();
        for(int n:nums2)
        {
            if(set1.contains(n))
            {
                set2.add(n);
            }
        }
         int[] newarray=new int[set2.size()];
         int index=0;
         for(int n: set2)
         {
            newarray[index++]=n;
         }
       return newarray;
    }
}