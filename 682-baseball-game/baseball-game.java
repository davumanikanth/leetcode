import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].matches("-?\\d+"))
            {
                int num=Integer.parseInt(operations[i]);

                s.push(num);
            }
            
             else   if(operations[i].equals("D"))
                {
                    int num1=2* s.peek();
                    s.push(num1);
                }
                else if(operations[i].equals("C"))
                {
                    s.pop();
                }

            
            else
            {
                if(s.size()>=2)
                {
                int num3=s.get(s.size()-2);
                int num4=s.get(s.size()-1);
                int num5=num3+num4;
                s.push(num5);
                }
                else if(s.size()==1)
                {
                    int num8=s.peek();
                    s.push(num8);

                }


            }
        }
        int result=0;
        for(int num6:s)
        {
            result=result+num6;

        }
return result;
        
    }
}