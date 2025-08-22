import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String str:tokens)
        {
            
            if(str.equals("+"))
            {
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1+num2);

            }
            else if(str.equals("-"))
            {
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1-num2);

            }
            else if(str.equals("*"))
            {
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1*num2);

            }
             else if(str.equals("/"))
            {
                int num2=stack.pop();
                int num1=stack.pop();
                stack.push(num1/num2);

            }
            else

            {
                int num=Integer.parseInt(str);
                stack.push(num);
            }

        }
        return stack.pop();
        
    }
}