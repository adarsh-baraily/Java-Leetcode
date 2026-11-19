class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char newch = Character.toLowerCase(ch);
            freq[newch - 'a'] = freq[newch - 'a'] + 1;
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char newch = Character.toLowerCase(ch);
            if(freq[newch - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}