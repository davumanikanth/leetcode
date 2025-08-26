class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max=0;
        HashMap<Double,Integer> group=new HashMap<>();
                for(int i=0;i<dimensions.length;i++)
        {
            int length=dimensions[i][0];
            int width=dimensions[i][1];
            int sqrootinside=(length*length) +(width*width);
            double diagonal=Math.sqrt(sqrootinside);
            int area=length*width;
            if(group.containsKey(diagonal))
            {
                group.put(diagonal,Math.max(group.get(diagonal),area));
            }
            else
            {
            group.put(diagonal,area); 
            }           
             

        }
        double max1=0;
         int value=0;
        for(Map.Entry<Double,Integer> entry:group.entrySet())
        {
        
            if(entry.getKey()>max1)
            {
                max1=entry.getKey();
                value=entry.getValue();


            }

            

        }
        
        return value;
    }
}