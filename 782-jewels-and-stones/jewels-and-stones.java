class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> imp = new HashSet<>();
        for(int i = 0; i < jewels.length(); i++) {
            imp.add(jewels.charAt(i));
        }
        int count = 0;
        for(int j = 0; j < stones.length(); j++) {
            if(imp.contains(stones.charAt(j))) {
                count++;
            }
        }
        return count;
    }
}