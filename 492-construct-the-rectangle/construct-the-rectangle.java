class Solution {
    public int[] constructRectangle(int area) {
        int bredth=(int ) Math.sqrt(area);
        while(area%bredth!=0)
        {
            bredth--;
        }
        int length=area/bredth;
        int[] rectangle=new int[2];
        rectangle[0]=length;
        rectangle[1]=bredth;
        return rectangle;
        
    }
}