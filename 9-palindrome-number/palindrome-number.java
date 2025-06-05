class Solution {
    public boolean isPalindrome(int x) {
     int temp=x;
     int reverse=0;
      if(x<0)
     {
        return false;
     }
     while(x!=0)
     {
      int digit=x%10;
      if(reverse>Integer.MAX_VALUE/10 ||reverse<Integer.MIN_VALUE)
      {
        return false;
      }
       reverse=reverse*10+digit;
      x=x/10;
     }
     if(temp==reverse)
     {
        return true;
     }
    
     

   
    
    return false;
        
    }
}