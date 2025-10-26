class Solution {
    public long removeZeros(long n) {
        String str=String.valueOf(n);
        str=str.replaceAll("0","");
        long result=Long.parseLong(str);
        return result;
        
    }
}