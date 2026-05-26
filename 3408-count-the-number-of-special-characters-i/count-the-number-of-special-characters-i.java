class Solution {

    public int numberOfSpecialChars(String word) {
        Set<Character> group = new HashSet<>();
        for (char c : word.toCharArray()) {
            group.add(c);
        }
        int res = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (group.contains(c) && group.contains((char) (c - 'a' + 'A'))) {
                res++;
            }
        }
        return res;
    }
}