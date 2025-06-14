class Solution {
    public String reverseWords(String s) {
        String[] string1=s.split("\\s+");
        String[] string2=new String[string1.length];
        for(int i=0;i<string1.length;i++)
        {
            string2[i]=reverse(string1[i]);
        }

        String newstring=String.join(" ",string2);
        
        return newstring;
    }
    public String reverse(String s)
    {
         return new StringBuilder(s).reverse().toString();
    }
}