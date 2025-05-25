class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<Integer> uniqelement=new LinkedHashSet<>();
        for(int num: nums)
        {
            uniqelement.add(num);
        }
        int index=0;
        for(int num: uniqelement)
        {
            nums[index++]=num;
        }
        
        
        return index;


        // int[] love=new int[n];
        // int index=0;
        // for(int i=0;i<n-1;i++)
        // {
          
        //         if(nums[i]==nums[i+1])
        //         {
        //             continue;
        //         }
        //         else
        //         {
        //             love[index]=nums[i];
        //             index++;
        //         }
            
        // }
        // love[index++]=nums[n-1];
        // for(int i=0;i<index;i++)
        // {
        //     nums[i]=love[i];
        // }
        // return index;
    }
}