class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=nums[i];
            group.put(key,group.getOrDefault(key,0)+1);
        }
        int maxfreq=0;
        for(int num: group.values())
        {
            maxfreq=Math.max(maxfreq,num);
        }
        int noofmaxfreq=0;
        for(int num: group.values())
        {
          if(num==maxfreq)
          {
            noofmaxfreq++;
          }  
        }
        return maxfreq*noofmaxfreq;
    }
}