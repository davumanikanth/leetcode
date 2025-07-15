class Solution {
    public boolean isValid(String word) {
        int vowcount=0;
        int concount=0;
        int digitcount=0;
        
        for(int i=0;i<word.length();i++)
        {

            char ch=word.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowcount++;
            }
            else if(!Character.isLetterOrDigit(ch))
            {
                return false;
            }
            else if(Character.isLetter(ch))
            {
                concount++;
            }
            else if(Character.isDigit(ch))
            {
                digitcount++;
            }
        }
        int sum3=vowcount+concount;
        if(vowcount>=1 && concount>=1 && word.length()>2 )
        {
            return true;
        }
        return false;
    }
}