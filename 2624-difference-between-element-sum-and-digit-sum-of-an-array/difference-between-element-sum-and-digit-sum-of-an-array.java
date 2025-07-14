class Solution {
    public int differenceOfSum(int[] nums) {
        StringBuilder group=new StringBuilder();
        for(int i=0;i<nums.length;i++)
        {
            group.append(nums[i]);
        }
        String result=group.toString();
        int sum=0;
        for(int i=0;i<result.length();i++)
        {
            sum+=result.charAt(i)-'0';
        }
        int eleSum=0;
        for(int i=0;i<nums.length;i++)
        {
            eleSum+=nums[i];
 
        }
        return Math.abs(eleSum-sum);
        
    }
}