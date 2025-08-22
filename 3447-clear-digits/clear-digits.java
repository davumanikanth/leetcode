import java.util.Stack;
class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                stack.push(ch);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
        }
        StringBuilder str=new StringBuilder();
        for(char ch:stack)
        {
            str.append(ch);
        }
        return str.toString();
        
        
    }
}