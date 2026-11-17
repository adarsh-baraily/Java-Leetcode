class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(0, 0, n, new StringBuilder(), res);
        return res;
    }
    private void helper(int open, int close,int n, StringBuilder ds, List<String> res) {
        if(open == n && close == n) {
            res.add(ds.toString());
            return;
        }
        if(open <  n) {
            ds.append('(');
            helper(open + 1, close, n, ds, res);
            ds.deleteCharAt(ds.length() - 1);
        }
        if(close < open) {
            ds.append(')');
            helper(open, close + 1, n, ds, res);
            ds.deleteCharAt(ds.length() - 1);
        }
    }
}