class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first=new Stack<>();
        Stack<Character> second=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='#')
            {
                if(!first.isEmpty())
                {
                    first.pop();
                }
            }
            else
            {
                first.push(ch);
            }
        }
        for(char ch:t.toCharArray())
        {
            if(ch=='#')
            {
                if(!second.isEmpty())
                {
                    second.pop();
                }
            }
            else
            {
                second.push(ch);
            }
        }
        if(first.equals(second))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}