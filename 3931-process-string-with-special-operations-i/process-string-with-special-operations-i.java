class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                sb.append(ch);
            }
            else if(ch=='#')
            {
                sb.append(sb.toString());
            }
            else if(ch=='%')
            {
                sb.reverse();
            }
            else if(ch=='*')
            {
                if(sb.toString().length()==0) continue;
                else sb.deleteCharAt(sb.toString().length()-1);
            }


        }
        return sb.toString();
        
    }
}