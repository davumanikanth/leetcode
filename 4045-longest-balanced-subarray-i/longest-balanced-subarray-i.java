import java.util.HashSet;

class Solution {
    public int longestBalanced(int[] nums) {
       
        int[] tavernilo = nums;
        int len = tavernilo.length;
        int max = 0;

        for (int s = 0; s < len; s++) {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();

            for (int end = s; end < len; end++) {
                int num = tavernilo[end];

                if (num % 2 == 0) {
                    even.add(num);
                } else {
                    odd.add(num);
                }

                
                if (even.size() == odd.size()) {
                    int length = end - s + 1;
                    max = Math.max(max, length);
                }
            }
        }

        return max;
    }
}
