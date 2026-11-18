class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> one = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(!one.contains(nums[i])) {
                one.add(nums[i]);
            } else {
                one.remove(nums[i]);
            }
        }
        for(int n : one) {
            return n;
        }
        return -1;
    }
}