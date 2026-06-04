class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        
            for(int j=num1;j<=num2;j++)
            {
            String n3=Integer.toString(j);
            if(n3.length()<3) continue;
            for(int i=1;i<n3.length()-1;i++)
            {
                int before=n3.charAt(i-1)-'0';
                int middle=n3.charAt(i)-'0';
                int after=n3.charAt(i+1)-'0';
                if(middle > before && middle >after) count++;
                if(middle <before && middle <after) count++;
            }
            }
        
        return count;
        
    }
}