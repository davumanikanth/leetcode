class Solution {
    public int maxDepth(String s) {
        int ans=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
             if(ch=='(')
             {
                stack.push(ch);

             }
             else if(ch==')')
             {
                stack.pop();

             }
             ans=Math.max(ans,stack.size());
        }
        return ans;
        
    }
}