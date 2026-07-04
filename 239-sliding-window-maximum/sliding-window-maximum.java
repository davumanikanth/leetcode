import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int ans[] = new int[n - k + 1];

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int index = 0;

        for (int i = 0; i < n; i++) {


            // add current element
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);


            // remove element outside window
            if (i >= k) {

                int remove = nums[i - k];

                map.put(remove, map.get(remove) - 1);

                if (map.get(remove) == 0) {
                    map.remove(remove);
                }
            }


            // window size reached
            if (i >= k - 1) {
                ans[index++] = map.lastKey();
            }
        }

        return ans;
    }
}