class Solution {
    public boolean areNumbersAscending(String s) {
        String[] word=s.split("\\s+");
        String[] number=new String[s.length()];
        int index=0;
        for(String str: word)
        {
            if(str.matches("\\d+"))
            {
                  number[index++]=str;
            }
        }
        int[] intarray=new int[index];
        
    
        for(int i=0;i<index;i++)
        {
            intarray[i]=Integer.parseInt(number[i]);
        }
        for(int i=0;i<intarray.length-1;i++)
        {
            if(intarray[i]>=intarray[i+1])
            {
                return false;
            }
        }
      
        
       
        return true;
        


        
    }
}