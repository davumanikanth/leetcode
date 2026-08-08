class Solution {

    public boolean solve(int i, int j, String s, String t) {

        if (i < 0) return true;

        if (j < 0) return false;

        if (s.charAt(i) == t.charAt(j)) {
            return solve(i - 1, j - 1, s, t);
        }

        return solve(i, j - 1, s, t);
    }

    public boolean canMakeSubsequence(String s, String t) {

        if (s.length() > t.length()) return false;

        int[] prefix =new int[s.length()];
        Arrays.fill(prefix, -1);
        int[] suffix=new int[s.length()];
        Arrays.fill(suffix, -1);
        int i=0;
        int j=0;
        
        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                prefix[i]=j;
                i++;
                j++;
                
            }
            else{

            j++;
            }
        }
        
        int x=s.length()-1;
        int y=t.length()-1;
        while(x >= 0 && y >= 0)
        {
            if(s.charAt(x)==t.charAt(y))
            {
                suffix[x]=y;
                x--;
                y--;
            }
            else
            {
                y--;
            }
        }

        for(int k=0;k<prefix.length;k++)
        {
            if (k > 0 && prefix[k - 1] == -1) {
        continue;
    }

    // Suffix after k must be matchable
    if (k < prefix.length - 1 && suffix[k + 1] == -1) {
        continue;
    }
            
            int left = (k == 0) ? -1 : prefix[k- 1];           
            int right=(k==prefix.length-1)? t.length(): suffix[k+1];
            if(left+1<right) 
            {
                return true;
              
            
            } 
        }
      return false;

    }
}
// they were asked to print the replaced string 
// if (left + 1 < right) {

//     char replacement = t.charAt(left + 1);

//     String result = s.substring(0, k)
//             + replacement
//             + s.substring(k + 1);

//     System.out.println(result);

//     return true;
// }