class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        bt(s.toCharArray(), 0, new StringBuilder(), res);
        return res;
    }
    
    private void bt(char[] chars, int idx, StringBuilder curr, List<String> res) {
        if (idx == chars.length) {
            res.add(curr.toString());
            return;
        }
        
        char c = chars[idx];
        
        if (Character.isLetter(c)) {
            
            curr.append(Character.toLowerCase(c));
            bt(chars, idx + 1, curr, res);
            curr.deleteCharAt(curr.length() - 1);
            
            curr.append(Character.toUpperCase(c));
            bt(chars, idx + 1, curr, res);
            curr.deleteCharAt(curr.length() - 1);
        } else {
            curr.append(c);
            bt(chars, idx + 1, curr, res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}