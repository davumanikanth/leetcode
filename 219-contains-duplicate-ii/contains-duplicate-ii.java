class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

Map<Integer,Integer> group=new HashMap<>();//stores the  number and index
int n=nums.length;
  for(int i=0;i<n;i++)
  {
    if(!group.containsKey(nums[i]))
    {
         group.put(nums[i],i);//if it doesnt contain that element put  the number in hashmap
    }
    else{
        int pastIndex=group.get(nums[i]);//get the same number index which is placed in the hashmap
        if(Math.abs(pastIndex-i)<=k)//subtract it if it is less than k 
        {
            return true;
        }
        else//if it greater than k then 
        {
            group.put(nums[i],i);
        }
    }

  }
  return false;
        
        
    }
}