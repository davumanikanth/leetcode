class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        int open=0;
        int close=0;
        f("",res,open ,close,n);
        return res;
        
    }
    public void f(String curr,List<String> res,int open,int close,int n)
    {
        if(curr.length()==2*n)
        {
            res.add(curr);
            return;
        }
        if(open<n) f(curr+"(", res,open+1,close,n);
        if(close<open) f(curr+")",res,open,close+1,n);
    }

}