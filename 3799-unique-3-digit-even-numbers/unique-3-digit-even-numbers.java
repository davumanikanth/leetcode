class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> group=new HashSet<>();
                boolean[] map=new boolean[digits.length];

        f(0,digits,group,0,map);
       
        int[] arr=new int[group.size()];
        return group.size();
    }
    public void f(int index,int[] digits,HashSet<Integer> group,int sum,boolean[] map)
    {
        if(index==3)
        {
            if(sum%2==0)
            {
                group.add(sum);
                

            }
            return;

        }
        for(int i=0;i<digits.length;i++)
        {
            if(map[i]==false)
            {
                if(index==0 && digits[i]==0 ) continue;
                map[i]=true;
            
            f(index+1,digits,group,sum*10 +digits[i],map);
            map[i]=false;

            }
            
        
        }
        
    }
}