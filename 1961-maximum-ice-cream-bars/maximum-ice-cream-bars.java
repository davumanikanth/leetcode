class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        int maxcost=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++)
        {
            maxcost+=costs[i];
            if(maxcost<=coins)
            {
               count= i+1;
            }
            else 
            {
               
                break;
            }
            
        }
        return count;
    }
}