class Solution {
    public boolean isSubsequence(String s, String t) {
        return helper(0, 0, s, t);
    }
    private boolean helper(int i, int j, String s, String t) {
        if(i == s.length()) {
            return true;
        }
        if(j == t.length()) {
            return false;
        }
        if(s.charAt(i) == t.charAt(j)) {
            return helper(i + 1, j + 1, s, t);
        }
        return helper(i, j + 1, s, t);
    }
}