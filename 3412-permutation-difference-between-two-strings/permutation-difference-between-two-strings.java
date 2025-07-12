class Solution {
    public int findPermutationDifference(String s, String t) {

       Map<Character,Integer> group1=new HashMap<>();
       for(int i=0;i<t.length();i++)
       {
        group1.put(t.charAt(i),i);
       } 
       int result=0;
       for(int i=0;i<s.length();i++)
       {
        int num=group1.get(s.charAt(i));
        result=result+Math.abs(i-num);
        
       }
       return result;
    }
}