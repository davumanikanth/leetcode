class Solution {
    public int compareVersion(String version1, String version2) {
        String[] first=version1.split("\\.");
        String[] second=version2.split("\\.");
        int length=Math.max(first.length,second.length);
        for(int i=0;i<length;i++)
        {
            int num1=0;
            int num2=0;
            if(i<first.length)
            {
                num1=Integer.parseInt(first[i]);

            }
            if(i<second.length)
            {
                num2=Integer.parseInt(second[i]);
            }
            if(num1<num2)
            {
                return -1;
            }
            else if(num1>num2)
            {
                return 1;
            }
        }
        return 0;
    }
}