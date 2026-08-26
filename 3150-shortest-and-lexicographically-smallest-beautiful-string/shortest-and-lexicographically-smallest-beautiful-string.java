class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        String ans="";
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++)
        {
            if(s.charAt(right)=='1') count++;
            while (count > k) {
                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }

            // Remove unnecessary leading zeros
            while (left <= right && s.charAt(left) == '0') {
                left++;
            }

            if(count==k)
            {
                String current=s.substring(left,right+1);
                if(current.length()<min || (current.length()==min &&  current.compareTo(ans)<0))
                {
                    ans=current;
                    min=Math.min(min,current.length());
                }
            }
            
            




        }
        return ans;
    
        
    }
}