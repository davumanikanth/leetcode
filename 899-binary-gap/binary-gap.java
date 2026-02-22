class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);

        int lefti = -1;
        int righti = 0;
        int res = 0;

        while (righti < str.length()) {
            if (str.charAt(righti) == '1') {
                if (lefti != -1) {
                    res = Math.max(res, righti - lefti);
                }
                lefti = righti;
            }
            righti++;
        }

        return res;
    }
}