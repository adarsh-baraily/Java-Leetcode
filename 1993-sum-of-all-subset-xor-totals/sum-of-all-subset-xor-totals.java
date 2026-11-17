class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(0, nums, 0);
    }
    private int helper(int i, int[] nums, int currentXOR) {
        if (i == nums.length) {
            return currentXOR;
        }
        int pick = helper(i + 1, nums, currentXOR ^ nums[i]);
        int notpick = helper(i + 1, nums, currentXOR);
        int res = pick + notpick;
        return res;
    }
}