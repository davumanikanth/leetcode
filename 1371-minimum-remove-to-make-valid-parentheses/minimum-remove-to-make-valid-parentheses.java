class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        boolean[] arr=new boolean[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                stack.push(i);
            }
            else if(ch==')')
            {
                if(stack.isEmpty())
                {
                    arr[i]=true;

                }
                else
                {
                    stack.pop();
                }
            }

        }
        while(!stack.isEmpty())
        {
            arr[stack.pop()]=true;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            char ch=s.charAt(i);
            if(arr[i]==false)
            {
                result.append(ch);

            }
        }
        return result.toString();
        
    }
}