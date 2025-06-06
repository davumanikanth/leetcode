//not understanded please follow later
class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        char[] rightMin = new char[n];
        
        // Step 1: Precompute the smallest character to the right (including current)
        rightMin[n - 1] = s.charAt(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = (char) Math.min(s.charAt(i), rightMin[i + 1]);
        }

        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Step 2: Process each character
        for (int i = 0; i < n; i++) {
            stack.push(s.charAt(i)); // Push current character to stack

            // While top of stack <= smallest remaining character in s
            while (!stack.isEmpty() && (i == n - 1 || stack.peek() <= rightMin[i + 1])) {
                res.append(stack.pop()); // Pop to result
            }
        }

        return res.toString();
    }
}
