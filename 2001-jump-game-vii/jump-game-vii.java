class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        int weKnow=0;
        while(!q.isEmpty())
        {
            int index=q.remove();
            int l=Math.max(weKnow+1,index+minJump);
            int r=Math.min(index+maxJump,n-1);
            for(int i=l;i<=r;i++)
            {
                if(s.charAt(i)=='0')
                {
                    if(i==n-1)
                    {
                        return true;
                    }
                    q.add(i);
                }
            }
            weKnow=r;
        }
        return false;  
              }}