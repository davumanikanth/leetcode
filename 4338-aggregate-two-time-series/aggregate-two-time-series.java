// 
import java.util.*;

class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {

        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        TreeMap<Integer, Integer> map2 = new TreeMap<>();
        TreeSet<Integer> times = new TreeSet<>();

        for (int[] x : series1) {
            map1.put(x[0], x[1]);
            times.add(x[0]);
        }

        for (int[] x : series2) {
            map2.put(x[0], x[1]);
            times.add(x[0]);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int t : times) {

            Integer next1 = map1.ceilingKey(t);
            Integer next2 = map2.ceilingKey(t);

            int val1 = (next1 == null) ? 0 : map1.get(next1);
            int val2 = (next2 == null) ? 0 : map2.get(next2);

            ans.add(Arrays.asList(t, val1 + val2));
        }

        return ans;
    }
}