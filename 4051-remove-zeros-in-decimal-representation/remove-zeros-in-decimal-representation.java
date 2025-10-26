// class Solution {
//     public long removeZeros(long n) {
//         String str=String.valueOf(n);
//         str=str.replaceAll("0","");
//         long result=Long.parseLong(str);
//         return result;
        
//     }
// }
 class Solution {
    public long removeZeros(long n) {
        long result=0;
        long place=1;
        while(n>0)
        {
            long digit=n%10;
            if(digit!=0)
           
            {
                result= result+digit*place;
                place=place*10;
            }
            n=n/10;
        }
        return result;
    }
 }