class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      char[] first=jewels.toCharArray();
      char[] second=stones.toCharArray();
      int count=0;
      for(int i=0;i<first.length;i++)
      {
        for(int j=0;j<second.length;j++)
        {
            if(first[i]==second[j])
            {
                count++;
            }
        }
      }  
      return count;
    }
}