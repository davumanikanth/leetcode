class Solution {
    public int largestInteger(int[] nums, int k) {

        if (nums.length < k) {
            return -1;
        }

        HashMap<Integer, Integer> group = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                group.put(x, group.getOrDefault(x, 0) + 1);
            }
        }

        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : group.entrySet()) {

            if (entry.getValue() == 1) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}