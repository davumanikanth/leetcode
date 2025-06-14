class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

      String result1=String.join("",word1);
      String result2=String.join("",word2);
    char[] chars1=result1.toCharArray();
      char[] chars2=result2.toCharArray();
      
      if(Arrays.equals(chars1,chars2))
      {
        return true;
      } 
      return false;
    }
}