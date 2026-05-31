class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long mas=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++)
        {
            if(mas<asteroids[i])
            {
               return false;
            }
            mas+=asteroids[i];
        }
        return true;
        
    }
}