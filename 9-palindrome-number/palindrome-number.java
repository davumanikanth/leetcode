class Solution {
    public boolean isPalindrome(int x) {
     
     //based on test cases if the number is negative number return false;
      if(x<0)
     {
        return false;
     }
     //we need to store the value of x to temp 
     int temp=x;
     int reverse=0;

     //if the number is positive we need to find the reverse of the number and we need to match to the temp if it matches we need to return true; 
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