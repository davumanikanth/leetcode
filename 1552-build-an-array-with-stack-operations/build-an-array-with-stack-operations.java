class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operation=new ArrayList<>();
        int num=1;
        for(int t: target)
        {
            while(num<t)
            {
                operation.add("Push");
                operation.add("Pop");
                num++;
            }
           
            operation.add("Push");
            num++;
            
        }
        return operation;

    }
}