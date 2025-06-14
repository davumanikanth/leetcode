import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger num=new BigInteger(num1);
        BigInteger gum=new BigInteger(num2);
        BigInteger result=num.add(gum);
        return String.valueOf(result);
        
    }
}