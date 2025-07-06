class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowels=new HashMap<>();
         HashMap<Character,Integer> cons=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u')
            {
                vowels.put(ch,vowels.getOrDefault(ch,0)+1);
            }
            else
            {
                cons.put(ch,cons.getOrDefault(ch,0)+1);
            }

        }
        int maxvowels;
        int maxcons;
        if(vowels.isEmpty())
        {
            maxvowels=0;
        }else
        {
         maxvowels=Collections.max(vowels.values());
        }
        if(cons.isEmpty())
        {
            maxcons=0;
        }
        else
        {
         maxcons=Collections.max(cons.values());
        }
        int maxvalue=maxvowels+maxcons;
        return maxvalue;
        
    }
}