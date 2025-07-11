class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> group=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<heights.length;i++)
        {
            group.put(heights[i],names[i]);
        }
        String[] people=new String[names.length];
        int index=0;
        for(Map.Entry<Integer,String> entry:group.entrySet())
        {
             people[index++]=entry.getValue();
        }
        return people;
    }
}