class Solution {
   
    public boolean isVowel(char ch) 
        {
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    public String reverseVowels(String s) 
    {
        ArrayList<Character> temp=new ArrayList<>();
        for(char c:s.toCharArray())
        {
            if(isVowel(c))
            {
                temp.add(c);
            }
        }
        Collections.reverse(temp);
        StringBuilder result=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
                result.append(temp.get(j));
                j++;
            }
            else
            {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}