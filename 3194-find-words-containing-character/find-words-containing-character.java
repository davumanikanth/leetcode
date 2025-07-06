class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int[] index=new int[words.length];
        int index1=0;
         List<Integer> group=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(String.valueOf(x)))
            {
               group.add(i);
            }
        }
       
        return group;
    }
}