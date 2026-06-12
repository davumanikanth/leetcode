class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        List<List<Character>> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new ArrayList<>());
        }

        int idx = 0;
        int dir = 1;

        for (char ch : s.toCharArray()) {

            rows.get(idx).add(ch);

            if (idx == 0) {
                dir = 1;
            } else if (idx == numRows - 1) {
                dir = -1;
            }

            idx += dir;
        }

        StringBuilder ans = new StringBuilder();

        for (List<Character> row : rows) {
            for (char ch : row) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}