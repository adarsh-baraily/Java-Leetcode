class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> pang = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            pang.add(sentence.charAt(i));
        }
        if(pang.size() == 26) {
            return true;
        }
        else {
            return false;
        }
    }
}