import java.util.Stack;
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char ch1=Character.toLowerCase(s.charAt(i));
            char ch2=Character.toUpperCase(s.charAt(i));
            if(!stack.isEmpty() && (stack.peek()==ch1 && Character.isUpperCase(ch)  ) )
            {
                stack.pop();

            }
            else if(!stack.isEmpty() &&  (stack.peek()==ch2 && Character.isLowerCase(ch)  ) )
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        StringBuilder result=new StringBuilder();
        for(char ch:stack)
        {
            result.append(ch);
        }
        
        return result.toString();
    }
}