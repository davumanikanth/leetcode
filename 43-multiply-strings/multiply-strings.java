import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger first=new BigInteger(num1);
        BigInteger second=new BigInteger(num2);
        BigInteger third=first.multiply(second);

        String number=third.toString();
        return number;
        
        
    }
}