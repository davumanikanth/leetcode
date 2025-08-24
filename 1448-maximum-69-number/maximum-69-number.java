class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        char[] digit=str.toCharArray();
        for(int i=0;i<digit.length;i++)
        {
            if(digit[i]=='6')
            {
                digit[i]='9';
                break;
            }
        }


        String num1=String.valueOf(digit);
        int num2=Integer.parseInt(num1);
        return num2;
    }
}