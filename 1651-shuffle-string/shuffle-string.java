class Solution {
    public String restoreString(String s, int[] indices) {
        char [] given=s.toCharArray();
        char [] letter=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            letter[indices[i]]=given[i];
        }

        String str=new String(letter);
        return str;


    }
}