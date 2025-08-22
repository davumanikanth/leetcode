import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==ch)
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
         }
         StringBuilder result=new StringBuilder();
         for(char sh:stack)
         {
            result.append(sh);

         }
         return result.toString();

        
    }
}