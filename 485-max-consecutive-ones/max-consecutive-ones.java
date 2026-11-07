class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cc = 0;
        for(int n : nums){
            if(n == 1) {
                cc++;
            }
            else {
                max = Math.max(max, cc);
                cc = 0;
            }
        }
        return max > cc ? max : cc;
    }
}