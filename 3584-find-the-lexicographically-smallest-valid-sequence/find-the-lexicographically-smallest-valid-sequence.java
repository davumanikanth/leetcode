class Solution {
    public int[] validSequence(String word1, String word2) {
        int[] suffix=new int[word2.length()];
        int i=word1.length()-1,j=word2.length()-1; 
        Arrays.fill(suffix,-1);
        while(i >= 0 && j >= 0)
         {
         if(word1.charAt(i) == word2.charAt(j))
         {
        suffix[j]=i;
          j--;
         }

           i--;
        }
        int[] res=new int[word2.length()];
        int index=0;
        boolean changed=false;
        for(int k=0;k<word1.length()&& index<word2.length() ;k++)
        {
            if(word1.charAt(k)==word2.charAt(index))
            {
                res[index]=k;
                index++;
            }
            else if(changed==false)
            {
                if(index==word2.length()-1)
                {
                    res[index]=k;
                    changed=true;
                    index++;
                    
                }
                else if(suffix[index+1]>k )
                {
                    res[index]=k;
                    changed=true;
                    index++;
                    
                }
            }

        }

       if (index == word2.length()) {
            return res;
        }

        
        return new int[0]; 

    }
}