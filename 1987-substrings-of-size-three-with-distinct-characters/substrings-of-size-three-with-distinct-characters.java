class Solution {
    public int countGoodSubstrings(String s) {
        
        if(s.length()<3) return 0;
        HashMap<Character,Integer> group = new HashMap<>();
        int count = 0;

        int left = 0;

        // First window of size 3
        for(int i = 0; i < 3; i++)
        {
            group.put(s.charAt(i),
                    group.getOrDefault(s.charAt(i),0)+1);
        }

        if(group.size() == 3)
            count++;

        for(int i = 3; i < s.length(); i++)
        {
            char remove = s.charAt(left);

            group.put(remove,
                    group.get(remove)-1);

            if(group.get(remove)==0)
                group.remove(remove);

            left++;

            group.put(s.charAt(i),
                    group.getOrDefault(s.charAt(i),0)+1);

            if(group.size()==3)
                count++;
        }

        return count;
    }
}