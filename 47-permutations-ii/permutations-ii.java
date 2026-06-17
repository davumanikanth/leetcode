class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        HashSet<List<Integer>> set = new HashSet<>();

        boolean[] vis = new boolean[nums.length];

        f(nums, vis, set, new ArrayList<>());

        return new ArrayList<>(set);
    }

    public void f(int[] nums, boolean[] vis,
                  HashSet<List<Integer>> set,
                  ArrayList<Integer> group) {

        if (group.size() == nums.length) {
            set.add(new ArrayList<>(group));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!vis[i]) {
                vis[i] = true;
                group.add(nums[i]);

                f(nums, vis, set, group);

                group.remove(group.size() - 1);
                vis[i] = false;
            }
        }
    }
}