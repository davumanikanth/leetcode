class Solution {
    public String simplifyPath(String path) {
        StringBuilder str=new StringBuilder();
        String[] directory=path.split("/");
        Stack<String> stack=new Stack();
        for(String dir:directory)
        {

            if(dir.equals(".") || dir.equals(""))
            {
                continue;
            }
            else if(dir.equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(dir);
            }
        }
        StringBuilder result=new StringBuilder();
        for(String dir:stack)
        {
            result.append("/").append(dir);
        }

        if(result.length()==0)
        {
            return "/";
        }
        return result.toString();
        
    }
}