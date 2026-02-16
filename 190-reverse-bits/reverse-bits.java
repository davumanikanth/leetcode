class Solution {
    public int reverseBits(int n) {
        String str=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String reverse =new StringBuilder(str).reverse().toString();
        int number=(int)Long.parseLong(reverse,2);
        return number;
       

        
    }
}