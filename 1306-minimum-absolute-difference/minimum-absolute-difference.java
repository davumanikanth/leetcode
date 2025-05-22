class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

         List<List<Integer>> result=new ArrayList<>();

        int mindiff=arr[1]-arr[0];

        for(int i=1;i<arr.length-1;i++)
        {
            int min=arr[i+1]-arr[i];
            if(min<mindiff)
            {
                mindiff=min;
            }
        }
        for(int i=0;i<arr.length-1;i++)
    
        {
            int diff=arr[i+1]-arr[i];
            if(diff==mindiff)
            {
                
                 result.add(Arrays.asList(arr[i],arr[i+1]));

            }
            
        }
        return result;
        
    }
}