class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap< Character,Integer> S=new HashMap<>();
        HashMap<Character,Integer> T=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!S.containsKey(s.charAt(i)))
             {
                S.put(s.charAt(i),i);
             }
             if(!T.containsKey(t.charAt(i)))
             {
                T.put(t.charAt(i),i);
             }
             if(!S.get(s.charAt(i)).equals(T.get(t.charAt(i))))
             {
                return false;
             }

             
        }
        return true;
    }
}