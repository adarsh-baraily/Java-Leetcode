class Solution {
    private static final String[] Keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.isEmpty()) {
            return res;
        }
        helper(0, digits, new StringBuilder(), res);
        return res;
    }
    private void helper(int index, String digits, StringBuilder ds, List<String> res) {
        if(index == digits.length()) {
            res.add(ds.toString());
            return;
        }
        String letters = Keypad[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++) {
            ds.append(letters.charAt(i));
            helper(index + 1, digits, ds, res);
            ds.deleteCharAt(ds.length() - 1);
        }
    }
}