class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty())
        {
            return 0;
        }
        String[] word=s.split("\\s+");
        return word.length;
        
    }
}