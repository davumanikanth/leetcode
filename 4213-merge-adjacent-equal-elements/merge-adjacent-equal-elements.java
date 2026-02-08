class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack=new Stack<>();
        int i=0;
    List<Long> group=new ArrayList<>();
        while(i<nums.length)
        {
            long pukku=nums[i];
            while(!stack.isEmpty() && stack.peek()==pukku)
            {
                long lanja=stack.pop();
                pukku=lanja+pukku;
            }
            
            
            stack.push(pukku);
            
            i++;
        }
        while(!stack.isEmpty())
        {
            group.add(stack.pop());

         }
         Collections.reverse(group);
         return group;
    }
}