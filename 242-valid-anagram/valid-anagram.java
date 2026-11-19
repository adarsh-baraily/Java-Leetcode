class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char newch = Character.toLowerCase(ch);
            freq[newch - 'a'] = freq[newch - 'a'] + 1;
        }
        for(int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            char newch = Character.toLowerCase(ch);
            freq[newch - 'a'] = freq[newch - 'a'] - 1;
        }
        for(int k = 0; k < 26; k++) {
            if(freq[k] != 0) {
                return false;
            } 
        }
        return true;
    }
}