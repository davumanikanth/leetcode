class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxva=0;
        
        while(left<right)
        {
            
            int minheight=Math.min(height[left],height[right]);
            int width=right-left;
            int area=minheight*width;
            maxva=Math.max(maxva,area);
             

            if(height[left]<height[right])
            {
                left++;
            }
            else if(height[left]==height[right])
            {
                left++;
                right--;
            }
            else
            {
                right--;
            }
        }
        return maxva;
        
    }
}