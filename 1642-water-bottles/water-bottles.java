class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked=0;
        int emptybottle=0;
        while(numBottles >0)
        {
            drinked += numBottles;
            emptybottle += numBottles;

            numBottles = emptybottle / numExchange;
            emptybottle = emptybottle % numExchange;

        }
        return drinked;
        
    }
}